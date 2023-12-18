package com.example.projekakhir

import com.google.gson.annotations.SerializedName

data class ResponseBuah(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null
)

data class DataItem2(

	@field:SerializedName("bibit")
	val bibit: String? = null,

	@field:SerializedName("penyakit")
	val penyakit: String? = null,

	@field:SerializedName("id_kategori")
	val idKategori: Int? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("perawatan")
	val perawatan: String? = null
)
