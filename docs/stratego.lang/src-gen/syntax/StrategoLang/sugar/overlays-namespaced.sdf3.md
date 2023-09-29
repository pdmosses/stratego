---
title: overlays-namespaced.sdf3
---

# `overlays-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/overlays-namespaced.sdf3]

[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/overlays-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/overlays-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../modules-namespaced.sdf3#StrategoLang/sugar/overlays-namespaced_139_177" id="StrategoLang/sugar/overlays-namespaced_7_45" title="Referenced at ../modules-namespaced.sdf3 line 6">StrategoLang/sugar/overlays-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_57_97" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_101_135" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>

<span class="keyword">sorts</span> <span id="StrategoLang-Overlay_143_163" title="Not referenced locally, nor via imports">StrategoLang-Overlay</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Overlay_188_208" title="Not referenced locally, nor via imports">StrategoLang-Overlay</span>.<span class="cons_Constructor"><span id="OverlayNoArgs_209_222" title="Not referenced locally, nor via imports">OverlayNoArgs</span></span> = &lt;&lt;<a href="../../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_227_242" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt; <span class="cons_String">=</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_247_264" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <span id="StrategoLang-Overlay_273_293" title="Not referenced locally, nor via imports">StrategoLang-Overlay</span>.<span class="cons_Constructor"><span id="Overlay_294_301" title="Not referenced locally, nor via imports">Overlay</span></span> = &lt;&lt;<a href="../../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_306_321" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/identifiers-namespaced.sdf3#StrategoLang-Id_645_660" id="StrategoLang-Id_325_340" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_353_370" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }

</code></pre></td></tr></tbody></table></div>