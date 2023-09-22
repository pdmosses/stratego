---
title: overlays.sdf3
---

# `overlays.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/overlays.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/overlays.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/overlays.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3#gradual-types/overlays_137_159" id="gradual-types/overlays_7_29" title="Referenced at ../main.sdf3 line 8">gradual-types/overlays</a>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_40_56" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/signatures.sdf3#core/signatures_7_22" id="core/signatures_59_74" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../signatures.sdf3#gradual-types/signatures_7_31" id="gradual-types/signatures_77_101" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>
  <a href="../../sugar/overlays.sdf3#sugar/overlays_7_21" id="sugar/overlays_104_118" title="Defined at ../../sugar/overlays.sdf3 line 1">sugar/overlays</a>

<span class="keyword">context-free syntax</span>
  <span id="Overlay_142_149" title="Not referenced locally, nor via imports">Overlay</span>.<span class="cons_Constructor"><span id="OverlayDeclNoArgs_150_167" title="Not referenced locally, nor via imports">OverlayDeclNoArgs</span></span> =
    [[<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_176_178" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>] <span class="cons_String">::</span> [<a href="../../core/signatures.sdf3#ConstType_1236_1245" id="ConstType_184_193" title="Defined at ../../core/signatures.sdf3 line 48, 50">ConstType</a>]]

  <span id="Overlay_199_206" title="Not referenced locally, nor via imports">Overlay</span>.<span class="cons_Constructor"><span id="OverlayDecl_207_218" title="Not referenced locally, nor via imports">OverlayDecl</span></span> =
    [[<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_227_229" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">(</span>[{<a href="../signatures.sdf3#Type_98_102" id="Type_233_237" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../../core/signatures.sdf3#ConstType_1236_1245" id="ConstType_251_260" title="Defined at ../../core/signatures.sdf3 line 48, 50">ConstType</a>]]

</code></pre></td></tr></tbody></table></div>