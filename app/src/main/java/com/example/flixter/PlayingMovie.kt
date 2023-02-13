package com.example.flixter

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class PlayingMovie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("poster_path")
    var movieImage: String? = null

    @SerializedName("overview")
    var description: String? = null
}