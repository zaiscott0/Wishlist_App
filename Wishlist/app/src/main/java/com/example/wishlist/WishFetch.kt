package com.example.wishlist

class WishFetch {
    companion object {
        private val ItemnameLst = mutableListOf<String>()
        private val urlLst = mutableListOf<String>()
        private val priceLst = mutableListOf<String>()

        fun addWishes(name: String, url: String, price: String) {
            ItemnameLst.add(name)
            urlLst.add(url)
            priceLst.add(price)
        }

        fun getWish(): MutableList<Info> {
            val info: MutableList<Info> = ArrayList()
            for (i in ItemnameLst.indices) {
                val ninfo = Info(ItemnameLst[i], urlLst[i], priceLst[i])
                info.add(ninfo)
            }
            return info
        }
    }
}

