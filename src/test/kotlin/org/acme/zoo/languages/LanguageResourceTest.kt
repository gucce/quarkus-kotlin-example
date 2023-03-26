package org.acme.zoo.languages

import com.acme.zoo.languages.LanguageResource
import io.quarkus.test.common.http.TestHTTPEndpoint
import io.quarkus.test.junit.QuarkusTest
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import org.hamcrest.CoreMatchers.hasItems
import org.junit.jupiter.api.Test

@QuarkusTest
@TestHTTPEndpoint(LanguageResource::class)
class LanguageResourceTest {

    @Test
    fun testHelloEndpoint() {
        When {
            get()
        } Then {
            statusCode(200)
            body("name", hasItems("Java", "Kotlin"))
            body("species", hasItems("object-oriented", "multi-paradigm"))
        }
    }
}