package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class P(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("p", consumer, initialAttributes, null, false, false), HtmlBlockInlineTag {

}
val P.asFlowContent : FlowContent
    get()  = this

val P.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class PARAM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("param", consumer, initialAttributes, null, true, true) {
    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}


}

@Suppress("unused")
open class PICTURE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("picture", consumer, initialAttributes, null, false, false), FlowInteractivePhrasingContent {

}
/**
 * Media source for 
 */
@HtmlTagMarker
fun PICTURE.source(classes : String? = null, block : SOURCE.() -> Unit = {}) : Unit = SOURCE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Embedded image
 */
@HtmlTagMarker
fun PICTURE.img(alt : String? = null, src : String? = null, classes : String? = null, block : IMG.() -> Unit = {}) : Unit = IMG(attributesMapOf("alt", alt,"src", src,"class", classes), consumer).visit(block)

val PICTURE.asFlowContent : FlowContent
    get()  = this

val PICTURE.asInteractiveContent : InteractiveContent
    get()  = this

val PICTURE.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class PRE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("pre", consumer, initialAttributes, null, false, false), HtmlBlockInlineTag {

}
val PRE.asFlowContent : FlowContent
    get()  = this

val PRE.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class PROGRESS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("progress", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {
    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}

    var max : String
        get()  = attributeStringString.get(this, "max")
        set(newValue) {attributeStringString.set(this, "max", newValue)}


}
val PROGRESS.asFlowContent : FlowContent
    get()  = this

val PROGRESS.asPhrasingContent : PhrasingContent
    get()  = this


