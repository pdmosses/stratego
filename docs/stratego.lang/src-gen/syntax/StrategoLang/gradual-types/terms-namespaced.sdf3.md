---
title: terms-namespaced.sdf3
---

# `terms-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/terms-namespaced.sdf3]

[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/terms-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/terms-namespaced.sdf3 "The source file on GitHub"

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
16
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main-namespaced.sdf3#StrategoLang/gradual-types/terms-namespaced_214_257" id="StrategoLang/gradual-types/terms-namespaced_7_50" title="Referenced at ../main-namespaced.sdf3 line 7">StrategoLang/gradual-types/terms-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_62_96" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../../sugar/terms-namespaced.sdf3#StrategoLang/sugar/terms-namespaced_7_42" id="StrategoLang/sugar/terms-namespaced_100_135" title="Defined at ../../sugar/terms-namespaced.sdf3 line 1">StrategoLang/sugar/terms-namespaced</a>        
  <a href="../signatures-namespaced.sdf3#StrategoLang/gradual-types/signatures-namespaced_7_55" id="StrategoLang/gradual-types/signatures-namespaced_139_187" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Term_414_431" id="StrategoLang-Term_212_229" title="Referenced at line 16">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#TypeAscription_432_446" id="TypeAscription_230_244" title="Referenced at line 16">TypeAscription</a></span> = [[<a href="#StrategoLang-Term_212_229" id="StrategoLang-Term_249_266" title="Defined at line 10">StrategoLang-Term</a>] <span class="cons_String">::</span> [<a href="../signatures-namespaced.sdf3#StrategoLang-Type_158_175" id="StrategoLang-Type_272_289" title="Defined at ../signatures-namespaced.sdf3 line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>]] { }

<span class="keyword">context-free priorities</span>

  {<a href="#StrategoLang-Term_212_229" id="StrategoLang-Term_325_342" title="Defined at line 10">StrategoLang-Term</a>.<span class="cons_Constructor">App</span>
   <a href="../../core/terms-namespaced.sdf3#StrategoLang-PreTerm_624_644" id="StrategoLang-PreTerm_350_370" title="Defined at ../../core/terms-namespaced.sdf3 line 24, 28, 29, 30, 31, 32, 33, 34, 35, 36">StrategoLang-PreTerm</a>.<span class="cons_Constructor">AppPT</span>
   <a href="#StrategoLang-Term_212_229" id="StrategoLang-Term_380_397" title="Defined at line 10">StrategoLang-Term</a>.<span class="cons_Constructor">BuildDefault</span>} &gt; <a href="#StrategoLang-Term_212_229" id="StrategoLang-Term_414_431" title="Defined at line 10">StrategoLang-Term</a>.<span class="cons_Constructor"><a href="#TypeAscription_230_244" id="TypeAscription_432_446" title="Defined at line 10">TypeAscription</a></span>

</code></pre></td></tr></tbody></table></div>