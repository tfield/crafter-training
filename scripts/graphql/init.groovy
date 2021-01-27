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
        .type(nonNull(graphQLString))
        .build()
        ]).build()