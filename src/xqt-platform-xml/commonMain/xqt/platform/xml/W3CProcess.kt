// Copyright (C) 2022 Reece H. Dunn. SPDX-License-Identifier: Apache-2.0
package xqt.platform.xml

/**
 * This annotation marks the annotation as implementing a W3C Editor's Draft
 * specification.
 *
 * Because the specification is a draft, the corresponding API is considered
 * experimental and as such the behavior of such API may be changed or the
 * API may be removed completely in any further release.
 *
 * > Beware using the annotated API especially if you're developing a library,
 * > since your library might become binary incompatible with the future
 * > versions of this library.
 *
 * Any usage of a declaration annotated with `@W3CEditorsDraft` must be accepted
 * either by annotating that usage with the [OptIn] annotation, e.g.
 * `@OptIn(W3CEditorsDraft::class)`, or by using the compiler argument
 * `-opt-in=xqt.platform.xml.W3CEditorsDraft`.
 */
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS)
@MustBeDocumented
annotation class W3CEditorsDraft

/**
 * This annotation marks the annotation as implementing a W3C Recommendation
 * specification.
 */
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS)
annotation class W3CRecommendation
