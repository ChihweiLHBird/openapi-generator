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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


/**
 * 
 *
 * @param httpDebugOperation 
 * @param underscoreType 
 * @param type 
 * @param typeWithUnderscore 
 */


data class PropertyNameMapping (

    @Json(name = "http_debug_operation")
    val httpDebugOperation: kotlin.String? = null,

    @Json(name = "_type")
    val underscoreType: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "type_")
    val typeWithUnderscore: kotlin.String? = null

) {


}

