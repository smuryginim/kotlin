package com.smuryginim.kotlin.stepik_course.builders


open class Tag(val name: String)

class Attribute(val name : String, val value : String)

fun <T: Tag> T.set(name: String, value: String?): T {
    TODO()
}

fun <T: Tag> Tag.doInit(tag: T, init: T.() -> Unit): T {
    TODO()
}

class Html: Tag("html")
class Table: Tag("table")
class Center: Tag("center")
class TR: Tag("tr")
class TD: Tag("td")
class Text(val text: String): Tag("b")

fun html(init: Html.() -> Unit): Html {
    TODO()
}

fun Html.table(init : Table.() -> Unit): Table {
    TODO()
}

fun Html.center(init : Center.() -> Unit): Center {
    TODO()
}

fun Table.tr(color: String? = null, init : TR.() -> Unit): TR {
    TODO()
}

fun TR.td(color: String? = null, align : String = "left", init : TD.() -> Unit): TD {
    TODO()
}

fun Tag.text(s : Any?): Text {
    TODO()
}

fun renderProductTable(): String {
    return html {
        table {
            tr(color = getTitleColor()){
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((key, product) in products.withIndex()) {
                tr {
                    td(color = getCellColor(key, 0)) {
                        text(product.description)
                    }
                    td(color = getCellColor(key, 1)) {
                        text(product.description)
                    }
                    td(color = getCellColor(key, 2)) {
                        text(product.description)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"