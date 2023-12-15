---
title: modules-namespaced.sdf3
hide:
  - toc
---

# `modules-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/modules-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/modules-namespaced.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main-namespaced.sdf3/#StrategoLang/gradual-types/modules-namespaced_4_3" id="StrategoLang/gradual-types/modules-namespaced_1_8" title="Referenced at ../main-namespaced.sdf3 line 4">StrategoLang/gradual-types/modules-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3/#StrategoLang/core/strategies-namespaced_1_8" id="StrategoLang/core/strategies-namespaced_5_3" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../signatures-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_1_8" id="StrategoLang/gradual-types/signatures-namespaced_6_3" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Def_10_3" title="Not referenced">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="DefHasTypeNoArgs_10_20" title="Not referenced">DefHasTypeNoArgs</span></span> = [[<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_10_41" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>] <span class="cons_String">::</span> [StrategoLang-SSimpleFunType]] { }
  <span id="StrategoLang-Def_11_3" title="Not referenced">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="DefHasType_11_20" title="Not referenced">DefHasType</span></span> = [[<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_11_35" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>]<span class="cons_String">(</span>[{StrategoLang-SType <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [StrategoLang-SSimpleFunType]] { }
  <span id="StrategoLang-Def_12_3" title="Not referenced">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="DefHasTType_12_20" title="Not referenced">DefHasTType</span></span> = [[<a href="../../core/strategies-namespaced.sdf3/#StrategoLang-SId_36_3" id="StrategoLang-SId_12_36" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>]<span class="cons_String">(</span>[{StrategoLang-SType <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{StrategoLang-Type <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [StrategoLang-SSimpleFunType]] { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
