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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*


/**
 * 
 *
 * @param i0 
 * @param n0 
 * @param i1 
 * @param n1 
 */
@Serializable

data class Apa (

    @SerialName(value = "i0") @Required val i0: kotlin.Int,

    @SerialName(value = "n0") @Required val n0: kotlin.Double,

    @SerialName(value = "i1") val i1: kotlin.Int? = null,

    @SerialName(value = "n1") val n1: kotlin.Double? = null

) {


}

