---
title: terms.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3/#gradual-types/terms_7_3" id="gradual-types/terms_1_8" title="Referenced at ../main.sdf3 line 7">gradual-types/terms</a>
<span class="keyword">imports</span>
  <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_3_3" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../../sugar/terms.sdf3/#sugar/terms_1_8" id="sugar/terms_4_3" title="Defined at ../../sugar/terms.sdf3 line 1">sugar/terms</a>
  <a href="../signatures.sdf3/#gradual-types/signatures_1_8" id="gradual-types/signatures_5_3" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>

<span class="keyword">context-free syntax</span>

  <a href="#Term_9_27" id="Term_9_3" title="Referenced at line 9, 13">Term</a>.<span class="cons_Constructor"><a href="#TypeAscription_13_55" id="TypeAscription_9_8" title="Referenced at line 13">TypeAscription</a></span> = [[<a href="#Term_9_3" id="Term_9_27" title="Defined at line 9">Term</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3/#Type_7_20" id="Type_9_37" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]]

<span class="keyword">context-free priorities</span>

  { <a href="#Term_9_3" id="Term_13_5" title="Defined at line 9">Term</a>.<span class="cons_Constructor"><a href="../../sugar/terms.sdf3/#App_16_8" id="App_13_10" title="Defined at ../../sugar/terms.sdf3 line 16">App</a></span> <a href="../../core/terms.sdf3/#PreTerm_21_20" id="PreTerm_13_14" title="Defined at ../../core/terms.sdf3 line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>.<span class="cons_Constructor"><a href="../../sugar/terms.sdf3/#AppPT_22_11" id="AppPT_13_22" title="Defined at ../../sugar/terms.sdf3 line 22">AppPT</a></span> <a href="#Term_9_3" id="Term_13_28" title="Defined at line 9">Term</a>.<span class="cons_Constructor"><a href="../../sugar/terms.sdf3/#BuildDefault_13_8" id="BuildDefault_13_33" title="Defined at ../../sugar/terms.sdf3 line 13">BuildDefault</a></span> } &gt; <a href="#Term_9_3" id="Term_13_50" title="Defined at line 9">Term</a>.<span class="cons_Constructor"><a href="#TypeAscription_9_8" id="TypeAscription_13_55" title="Defined at line 9">TypeAscription</a></span>
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
