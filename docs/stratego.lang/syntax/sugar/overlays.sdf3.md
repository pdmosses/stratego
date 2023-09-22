---
title: overlays.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../modules.sdf3#sugar/overlays_64_78" id="sugar/overlays_7_21" title="Referenced at ../modules.sdf3 line 5">sugar/overlays</a>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_32_48" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_51_61" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>

<span class="keyword">context-free sorts</span> <a href="../modules.sdf3#Overlay_188_195" id="Overlay_82_89" title="Referenced at ../modules.sdf3 line 15">Overlay</a>
<span class="keyword">context-free syntax</span>
  <a href="../modules.sdf3#Overlay_188_195" id="Overlay_112_119" title="Referenced at ../modules.sdf3 line 15">Overlay</a>.<span class="cons_Constructor"><span id="OverlayNoArgs_120_133" title="Not referenced locally, nor via imports">OverlayNoArgs</span></span> = &lt;&lt;<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_138_140" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt; <span class="cons_String">=</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_145_149" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

  <a href="../modules.sdf3#Overlay_188_195" id="Overlay_155_162" title="Referenced at ../modules.sdf3 line 15">Overlay</a>.<span class="cons_Constructor"><span id="Overlay_163_170" title="Not referenced locally, nor via imports">Overlay</span></span> =
    &lt;&lt;<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_179_181" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/identifiers.sdf3#Id_420_422" id="Id_185_187" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span> &lt;<a href="../../core/terms.sdf3#Term_180_184" id="Term_200_204" title="Defined at ../../core/terms.sdf3 line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

</code></pre></td></tr></tbody></table></div>