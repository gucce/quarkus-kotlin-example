package com.acme.zoo.languages

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/zoo/languages")
class LanguageResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getLanguages() = listOf(Language("Kotlin", "multi-paradigm"), Language("Java", "object-oriented"))

}

data class Language(val name: String, val species: String)
