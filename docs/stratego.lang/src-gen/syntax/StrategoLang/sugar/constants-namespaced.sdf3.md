---
title: constants-namespaced.sdf3
hide:
  - toc
---

# `constants-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/constants-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/constants-namespaced.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/sugar/constants-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/sugar/constants-namespaced_6_3 line 6; ../signatures-namespaced.sdf3/#StrategoLang/sugar/constants-namespaced_5_3 line 5; ../strategies-namespaced.sdf3/#StrategoLang/sugar/constants-namespaced_10_3 line 10; ../terms-namespaced.sdf3/#StrategoLang/sugar/constants-namespaced_6_3 line 6">StrategoLang/sugar/constants-namespaced</button>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/constants-namespaced.sdf3/#StrategoLang/core/constants-namespaced_1_8" id="StrategoLang/core/constants-namespaced_5_3" title="Defined at ../../core/constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>        
  <a href="../string-quotations-namespaced.sdf3/#StrategoLang/sugar/string-quotations-namespaced_1_8" id="StrategoLang/sugar/string-quotations-namespaced_6_3" title="Defined at ../string-quotations-namespaced.sdf3 line 1">StrategoLang/sugar/string-quotations-namespaced</a>

<span class="keyword">sorts</span> <span id="Char_8_7" title="Not referenced">Char</span><span class="keyword">-LEX</span> <span id="CharChar_8_16" title="Not referenced">CharChar</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="StrategoLang-Char_12_3" title="Multi-file references" data-urls="#StrategoLang-Char_15_21 line 15; ../strategies-namespaced.sdf3/#StrategoLang-Char_58_38 line 58; ../terms-namespaced.sdf3/#StrategoLang-Char_23_31 line 23">StrategoLang-Char</button> = <span class="cons_Lit">"'"</span> <a href="#StrategoLang-CharChar_13_3" id="StrategoLang-CharChar_12_27" title="Defined at line 13, 14">StrategoLang-CharChar</a> <span class="cons_Lit">"'"</span> { }
  <a href="#StrategoLang-CharChar_12_27" id="StrategoLang-CharChar_13_3" title="Referenced at line 12">StrategoLang-CharChar</a> = ~[\'\\\n\r] { }
  <a href="#StrategoLang-CharChar_12_27" id="StrategoLang-CharChar_14_3" title="Referenced at line 12">StrategoLang-CharChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\] { }
  <span id="StrategoLang-Id_15_3" title="Not referenced">StrategoLang-Id</span> = <a href="#StrategoLang-Char_12_3" id="StrategoLang-Char_15_21" title="Defined at line 12">StrategoLang-Char</a> {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
