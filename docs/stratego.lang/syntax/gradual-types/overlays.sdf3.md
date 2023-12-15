---
title: overlays.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3/#gradual-types/overlays_8_3" id="gradual-types/overlays_1_8" title="Referenced at ../main.sdf3 line 8">gradual-types/overlays</a>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_3_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/signatures.sdf3/#core/signatures_1_8" id="core/signatures_4_3" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>
  <a href="../signatures.sdf3/#gradual-types/signatures_1_8" id="gradual-types/signatures_5_3" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>
  <a href="../../sugar/overlays.sdf3/#sugar/overlays_1_8" id="sugar/overlays_6_3" title="Defined at ../../sugar/overlays.sdf3 line 1">sugar/overlays</a>

<span class="keyword">context-free syntax</span>
  <span id="Overlay_9_3" title="Not referenced">Overlay</span>.<span class="cons_Constructor"><span id="OverlayDeclNoArgs_9_11" title="Not referenced">OverlayDeclNoArgs</span></span> =
    [[<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_10_7" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>] <span class="cons_String">::</span> [<a href="../../core/signatures.sdf3/#ConstType_48_39" id="ConstType_10_15" title="Defined at ../../core/signatures.sdf3 line 48, 50">ConstType</a>]]

  <span id="Overlay_12_3" title="Not referenced">Overlay</span>.<span class="cons_Constructor"><span id="OverlayDecl_12_11" title="Not referenced">OverlayDecl</span></span> =
    [[<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_13_7" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">(</span>[{<a href="../signatures.sdf3/#Type_7_20" id="Type_13_13" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../../core/signatures.sdf3/#ConstType_48_39" id="ConstType_13_31" title="Defined at ../../core/signatures.sdf3 line 48, 50">ConstType</a>]]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
