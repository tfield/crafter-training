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
    .build()
    ]).build()


