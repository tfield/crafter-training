package graphql

import static graphql.Scalars.GraphQLString
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition
import static graphql.schema.GraphQLObjectType.newObject
import static graphql.schema.GraphQLNonNull.nonNull
import static graphql.schema.GraphQLList.list

def OUR_FOO_DATA = [
    [title: "ABC", count: 46],
    [title: "XYZ", count: 2]
]

def fooType = newObject()
    .name('FooType')
    .description('Foo Type')
    .fields([
        
        newFieldDefinition()
            .name('title')
            .description("Title")
            .type(nonNull(GraphQLString))
        .build(),
        
        newFieldDefinition()
            .name('count')
            .description("Count")
            .type(nonNull(GraphQLString))
        .build()
        
        ]).build()
        
        
        
schema.field(newFieldDefinition()
    .name('fooData')
    .description("All operations related to the fooData API")
    .type(list(fooType)))
    

schema.fetcher('craftercms_site', "fooData", { env -> return OUR_FOO_DATA})

