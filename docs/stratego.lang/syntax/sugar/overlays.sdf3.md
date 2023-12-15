---
title: overlays.sdf3
hide:
  - toc
---

# `overlays.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/overlays.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/overlays.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/overlays.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/overlays_1_8" title="Multi-file references" data-urls="../main.sdf3/#sugar/overlays_14_3 line 14; ../modules.sdf3/#sugar/overlays_5_3 line 5; ../../gradual-types/overlays.sdf3/#sugar/overlays_6_3 line 6">sugar/overlays</button>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_3_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_4_3" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>

<span class="keyword">context-free sorts</span> <a href="../modules.sdf3/#Overlay_15_5" id="Overlay_6_20" title="Referenced at ../modules.sdf3 line 15">Overlay</a>
<span class="keyword">context-free syntax</span>
  <a href="../modules.sdf3/#Overlay_15_5" id="Overlay_8_3" title="Referenced at ../modules.sdf3 line 15">Overlay</a>.<span class="cons_Constructor"><span id="OverlayNoArgs_8_11" title="Not referenced">OverlayNoArgs</span></span> = &lt;&lt;<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_8_29" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">=</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_8_36" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

  <a href="../modules.sdf3/#Overlay_15_5" id="Overlay_10_3" title="Referenced at ../modules.sdf3 line 15">Overlay</a>.<span class="cons_Constructor"><span id="Overlay_10_11" title="Not referenced">Overlay</span></span> =
    &lt;&lt;<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_11_7" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_11_13" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span> &lt;<a href="../../core/terms.sdf3/#Term_13_20" id="Term_11_28" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
