---
title: modules-namespaced.sdf3
---

# `modules-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/modules-namespaced.sdf3]

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main-namespaced.sdf3#StrategoLang/gradual-types/modules-namespaced_61_106" id="StrategoLang/gradual-types/modules-namespaced_7_52" title="Referenced at ../main-namespaced.sdf3 line 4">StrategoLang/gradual-types/modules-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_64_104" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_108_147" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../signatures-namespaced.sdf3#StrategoLang/gradual-types/signatures-namespaced_7_55" id="StrategoLang/gradual-types/signatures-namespaced_151_199" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-Def_224_240" title="Not referenced locally, nor via imports">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="DefHasTypeNoArgs_241_257" title="Not referenced locally, nor via imports">DefHasTypeNoArgs</span></span> = [[<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_262_278" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>] <span class="cons_String">::</span> [StrategoLang-SSimpleFunType]] { }
  <span id="StrategoLang-Def_320_336" title="Not referenced locally, nor via imports">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="DefHasType_337_347" title="Not referenced locally, nor via imports">DefHasType</span></span> = [[<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_352_368" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>]<span class="cons_String">(</span>[{StrategoLang-SType <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [StrategoLang-SSimpleFunType]] { }
  <span id="StrategoLang-Def_440_456" title="Not referenced locally, nor via imports">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="DefHasTType_457_468" title="Not referenced locally, nor via imports">DefHasTType</span></span> = [[<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_473_489" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>]<span class="cons_String">(</span>[{StrategoLang-SType <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{StrategoLang-Type <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [StrategoLang-SSimpleFunType]] { }

</code></pre></td></tr></tbody></table></div>