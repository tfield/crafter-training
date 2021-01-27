package graphql
import static graphql.Scalars.GraphQLString
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition
import static graphql.schema.GraphQLObjectType.newObject
import static graphql.schema.GraphQLNonNull.nonNull
import static graphql.schema.GraphQLList.list

def OUR_FOO_DATA = [
[title: "ABC", count: 46],
[title: "XYZ", count: 14]
]

// define the custom Type
def fooType = newObject()
.name('FooType')
.description('Foo Type')
.fields([
    newFieldDefinition()
    .name('title')
    .description('The title of the foo')
    .type(nonNull(GraphQLString))
    .build(),
    newFieldDefinition()
    .name('count')
    .description('Foo Count')
    .type(nonNull(Integer))
    .build()
    ]).build()


schema.field(newFieldDefinition()
// this field is used ot wrap the serice calls
.name('fooData')
.description('All operators related to the fooData API')
.type(list(fooType)))

// add the fetcher for the title field
schema.fetcher('craftercms_site', "fooData" , {
    env -> return OUR_FOO_DATA
})
