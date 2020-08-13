/**
 * 
 */
package ec.com.home.shop.graphql;

import java.io.IOException;
import java.net.URL;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;

/**
 * @author Cristhian Cabezas
 *
 */
@Component
public class GraphQLProvider {

	private GraphQL graphQL;

	@Bean
	public GraphQL graphQL() {
		return graphQL;
	}

	@PostConstruct
	public void init() throws IOException {
		URL url = Resources.getResource("schema.graphqls");
		String sdl = Resources.toString(url, Charsets.UTF_8);
		GraphQLSchema graphQLSchema = buildSchema(sdl);
		this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();

	}

	private GraphQLSchema buildSchema(String sdl) {
		// TODO Auto-generated method stub
		return null;
	}

}
