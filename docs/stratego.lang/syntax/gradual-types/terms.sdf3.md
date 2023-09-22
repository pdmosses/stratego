---
title: terms.sdf3
---

# `terms.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/terms.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/terms.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/terms.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3#gradual-types/terms_115_134" id="gradual-types/terms_7_26" title="Referenced at ../main.sdf3 line 7">gradual-types/terms</a>
<span class="keyword">imports</span>
  <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_37_47" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../../sugar/terms.sdf3#sugar/terms_7_18" id="sugar/terms_50_61" title="Defined at ../../sugar/terms.sdf3 line 1">sugar/terms</a>
  <a href="../signatures.sdf3#gradual-types/signatures_7_31" id="gradual-types/signatures_64_88" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>

<span class="keyword">context-free syntax</span>

  <a href="#Term_229_233" id="Term_113_117" title="Referenced at line 13">Term</a>.<span class="cons_Constructor"><a href="#TypeAscription_234_248" id="TypeAscription_118_132" title="Referenced at line 13">TypeAscription</a></span> = [[<a href="#Term_113_117" id="Term_137_141" title="Defined at line 9">Term</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3#Type_98_102" id="Type_147_151" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]]

<span class="keyword">context-free priorities</span>

  { <a href="#Term_113_117" id="Term_184_188" title="Defined at line 9">Term</a>.<span class="cons_Constructor"><a href="../../sugar/terms.sdf3#App_284_287" id="App_189_192" title="Defined at ../../sugar/terms.sdf3 line 16">App</a></span> <a href="../../core/terms.sdf3#PreTerm_354_361" id="PreTerm_193_200" title="Defined at ../../core/terms.sdf3 line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>.<span class="cons_Constructor"><a href="../../sugar/terms.sdf3#AppPT_417_422" id="AppPT_201_206" title="Defined at ../../sugar/terms.sdf3 line 22">AppPT</a></span> <a href="#Term_113_117" id="Term_207_211" title="Defined at line 9">Term</a>.<span class="cons_Constructor"><a href="../../sugar/terms.sdf3#BuildDefault_172_184" id="BuildDefault_212_224" title="Defined at ../../sugar/terms.sdf3 line 13">BuildDefault</a></span> } &gt; <a href="#Term_113_117" id="Term_229_233" title="Defined at line 9">Term</a>.<span class="cons_Constructor"><a href="#TypeAscription_118_132" id="TypeAscription_234_248" title="Defined at line 9">TypeAscription</a></span>
</code></pre></td></tr></tbody></table></div>