---
title: modules-namespaced.sdf3
---

# `modules-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/modules-namespaced.sdf3]

[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/modules-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/modules-namespaced.sdf3 "The source file on GitHub"

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
14
15
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main-namespaced.sdf3#StrategoLang/sugar/modules-namespaced_224_261" id="StrategoLang/sugar/modules-namespaced_7_44" title="Referenced at ../main-namespaced.sdf3 line 8">StrategoLang/sugar/modules-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/modules-namespaced.sdf3#StrategoLang/core/modules-namespaced_7_43" id="StrategoLang/core/modules-namespaced_56_92" title="Defined at ../../core/modules-namespaced.sdf3 line 1">StrategoLang/core/modules-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_96_135" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../overlays-namespaced.sdf3#StrategoLang/sugar/overlays-namespaced_7_45" id="StrategoLang/sugar/overlays-namespaced_139_177" title="Defined at ../overlays-namespaced.sdf3 line 1">StrategoLang/sugar/overlays-namespaced</a>        
  <a href="../rules-namespaced.sdf3#StrategoLang/sugar/rules-namespaced_7_42" id="StrategoLang/sugar/rules-namespaced_181_216" title="Defined at ../rules-namespaced.sdf3 line 1">StrategoLang/sugar/rules-namespaced</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Decl_241_258" title="Not referenced locally, nor via imports">StrategoLang-Decl</span>.<span class="cons_Constructor"><span id="Rules_259_264" title="Not referenced locally, nor via imports">Rules</span></span> = &lt;<span class="cons_String">rules</span>
  &lt;{<a href="#StrategoLang-Def_393_409" id="StrategoLang-Def_278_294" title="Defined at line 15">StrategoLang-Def</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <span id="StrategoLang-Decl_312_329" title="Not referenced locally, nor via imports">StrategoLang-Decl</span>.<span class="cons_Constructor"><span id="Overlays_330_338" title="Not referenced locally, nor via imports">Overlays</span></span> = &lt;<span class="cons_String">overlays</span>
  &lt;{StrategoLang-Overlay <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-Def_278_294" id="StrategoLang-Def_393_409" title="Referenced at line 12">StrategoLang-Def</a> = &lt;&lt;StrategoLang-RuleDef&gt;&gt; { }

</code></pre></td></tr></tbody></table></div>