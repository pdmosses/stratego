---
title: modules-namespaced.sdf3
hide:
  - toc
---

# `modules-namespaced.sdf3`



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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main-namespaced.sdf3/#StrategoLang/sugar/modules-namespaced_8_3" id="StrategoLang/sugar/modules-namespaced_1_8" title="Referenced at ../main-namespaced.sdf3 line 8">StrategoLang/sugar/modules-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/modules-namespaced.sdf3/#StrategoLang/core/modules-namespaced_1_8" id="StrategoLang/core/modules-namespaced_4_3" title="Defined at ../../core/modules-namespaced.sdf3 line 1">StrategoLang/core/modules-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_5_3" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../overlays-namespaced.sdf3/#StrategoLang/sugar/overlays-namespaced_1_8" id="StrategoLang/sugar/overlays-namespaced_6_3" title="Defined at ../overlays-namespaced.sdf3 line 1">StrategoLang/sugar/overlays-namespaced</a>        
  <a href="../rules-namespaced.sdf3/#StrategoLang/sugar/rules-namespaced_1_8" id="StrategoLang/sugar/rules-namespaced_7_3" title="Defined at ../rules-namespaced.sdf3 line 1">StrategoLang/sugar/rules-namespaced</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Decl_11_3" title="Not referenced">StrategoLang-Decl</span>.<span class="cons_Constructor"><span id="Rules_11_21" title="Not referenced">Rules</span></span> = &lt;<span class="cons_String">rules</span>
  &lt;{<a href="#StrategoLang-Def_15_3" id="StrategoLang-Def_12_5" title="Defined at line 15">StrategoLang-Def</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <span id="StrategoLang-Decl_13_3" title="Not referenced">StrategoLang-Decl</span>.<span class="cons_Constructor"><span id="Overlays_13_21" title="Not referenced">Overlays</span></span> = &lt;<span class="cons_String">overlays</span>
  &lt;{StrategoLang-Overlay <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-Def_12_5" id="StrategoLang-Def_15_3" title="Referenced at line 12">StrategoLang-Def</a> = &lt;&lt;StrategoLang-RuleDef&gt;&gt; { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
