/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.Category
import org.openapitools.client.models.Tag

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A pet for sale in the pet store
 *
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */


data class Pet (

    @Json(name = "name")
    var name: kotlin.String,

    @Json(name = "photoUrls")
    var photoUrls: kotlin.collections.MutableList<kotlin.String>,

    @Json(name = "id")
    var id: kotlin.Long? = null,

    @Json(name = "category")
    var category: Category? = null,

    @Json(name = "tags")
    var tags: kotlin.collections.MutableList<Tag>? = null,

    /* pet status in the store */
    @Json(name = "status")
    var status: Pet.Status? = null

) {

    /**
     * pet status in the store
     *
     * Values: available,pending,sold
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "available") available("available"),
        @Json(name = "pending") pending("pending"),
        @Json(name = "sold") sold("sold");
    }

}

