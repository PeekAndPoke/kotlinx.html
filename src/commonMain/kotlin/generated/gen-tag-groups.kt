package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

interface FlowContent : FlowOrMetaDataOrPhrasingContent, FlowOrHeadingContent, FlowOrMetaDataContent, FlowOrInteractiveContent, FlowOrPhrasingContent, SectioningOrFlowContent, FlowOrInteractiveOrPhrasingContent, Tag {
}

interface HeadingContent : FlowOrHeadingContent, Tag {
}

interface InteractiveContent : FlowOrInteractiveContent, FlowOrInteractiveOrPhrasingContent, Tag {
}

interface MetaDataContent : FlowOrMetaDataOrPhrasingContent, FlowOrMetaDataContent, Tag {
}

interface PhrasingContent : FlowOrMetaDataOrPhrasingContent, FlowOrPhrasingContent, FlowOrInteractiveOrPhrasingContent, Tag {
}

interface SectioningContent : SectioningOrFlowContent, Tag {
}

/**
 * Information on author
 */
@HtmlTagMarker
fun FlowContent.address(classes : String? = null, block : ADDRESS.() -> Unit = {}) : Unit = ADDRESS(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Long quotation
 */
@HtmlTagMarker
fun FlowContent.blockQuote(classes : String? = null, block : BLOCKQUOTE.() -> Unit = {}) : Unit = BLOCKQUOTE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Dialog box or window
 */
@HtmlTagMarker
fun FlowContent.dialog(classes : String? = null, block : DIALOG.() -> Unit = {}) : Unit = DIALOG(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Generic language/style container
 */
@HtmlTagMarker
fun FlowContent.div(classes : String? = null, block : DIV.() -> Unit = {}) : Unit = DIV(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Definition list
 */
@HtmlTagMarker
fun FlowContent.dl(classes : String? = null, block : DL.() -> Unit = {}) : Unit = DL(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Form control group
 */
@HtmlTagMarker
fun FlowContent.fieldSet(classes : String? = null, block : FIELDSET.() -> Unit = {}) : Unit = FIELDSET(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Figure with optional caption
 */
@HtmlTagMarker
fun FlowContent.figure(classes : String? = null, block : FIGURE.() -> Unit = {}) : Unit = FIGURE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Caption for 
 */
@HtmlTagMarker
fun FlowContent.figcaption(classes : String? = null, block : FIGCAPTION.() -> Unit = {}) : Unit = FIGCAPTION(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Footer for a page or section
 */
@HtmlTagMarker
fun FlowContent.footer(classes : String? = null, block : FOOTER.() -> Unit = {}) : Unit = FOOTER(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Interactive form
 */
@HtmlTagMarker
fun FlowContent.form(action : String? = null, encType : FormEncType? = null, method : FormMethod? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", method?.enumEncode(),"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowContent.getForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.get.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowContent.postForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.post.realValue,"class", classes), consumer).visit(block)
@Suppress("DEPRECATION")
@HtmlTagMarker
fun FlowContent.putForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.put.realValue,"class", classes), consumer).visit(block)
@Suppress("DEPRECATION")
@HtmlTagMarker
fun FlowContent.deleteForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.delete.realValue,"class", classes), consumer).visit(block)
@Suppress("DEPRECATION")
@HtmlTagMarker
fun FlowContent.patchForm(action : String? = null, encType : FormEncType? = null, classes : String? = null, block : FORM.() -> Unit = {}) : Unit = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", FormMethod.patch.realValue,"class", classes), consumer).visit(block)

/**
 * Introductory or navigational aids for a page or section
 */
@HtmlTagMarker
fun FlowContent.header(classes : String? = null, block : HEADER.() -> Unit = {}) : Unit = HEADER(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Horizontal rule
 */
@HtmlTagMarker
fun FlowContent.hr(classes : String? = null, block : HR.() -> Unit = {}) : Unit = HR(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Ordered list
 */
@HtmlTagMarker
fun FlowContent.ol(classes : String? = null, block : OL.() -> Unit = {}) : Unit = OL(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Paragraph
 */
@HtmlTagMarker
fun FlowContent.p(classes : String? = null, block : P.() -> Unit = {}) : Unit = P(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Preformatted text
 */
@HtmlTagMarker
fun FlowContent.pre(classes : String? = null, block : PRE.() -> Unit = {}) : Unit = PRE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Caption for 
 */
@HtmlTagMarker
fun FlowContent.summary(classes : String? = null, block : SUMMARY.() -> Unit = {}) : Unit = SUMMARY(attributesMapOf("class", classes), consumer).visit(block)

/**
 * 
 */
@HtmlTagMarker
fun FlowContent.table(classes : String? = null, block : TABLE.() -> Unit = {}) : Unit = TABLE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Unordered list
 */
@HtmlTagMarker
fun FlowContent.ul(classes : String? = null, block : UL.() -> Unit = {}) : Unit = UL(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Document base URI
 */
@HtmlTagMarker
fun MetaDataContent.base(classes : String? = null, block : BASE.() -> Unit = {}) : Unit = BASE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Document title
 */
@HtmlTagMarker
fun MetaDataContent.title(block : TITLE.() -> Unit = {}) : Unit = TITLE(emptyMap, consumer).visit(block)
/**
 * Document title
 */
@HtmlTagMarker
fun MetaDataContent.title(content : String = "") : Unit = TITLE(emptyMap, consumer).visit({+content})

