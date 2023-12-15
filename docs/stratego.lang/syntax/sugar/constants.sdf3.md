---
title: constants.sdf3
hide:
  - toc
---

# `constants.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/constants.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/constants.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/constants.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/constants_1_8" title="Multi-file references" data-urls="../main.sdf3/#sugar/constants_7_3 line 7; ../signatures.sdf3/#sugar/constants_5_3 line 5; ../strategies.sdf3/#sugar/constants_9_3 line 9; ../terms.sdf3/#sugar/constants_5_3 line 5">sugar/constants</button>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/constants.sdf3/#core/constants_1_8" id="core/constants_5_3" title="Defined at ../../core/constants.sdf3 line 1">core/constants</a>
  <a href="../string-quotations.sdf3/#sugar/string-quotations_1_8" id="sugar/string-quotations_6_3" title="Defined at ../string-quotations.sdf3 line 1">sugar/string-quotations</a>

<span class="keyword">lexical sorts</span> <button class="modal-open" id="Char_8_15" title="Multi-file references" data-urls="#Char_13_14 line 13; ../strategies.sdf3/#Char_59_31 line 59; ../terms.sdf3/#Char_21_23 line 21">Char</button> <a href="#CharChar_10_18" id="CharChar_8_20" title="Referenced at line 10">CharChar</a>
<span class="keyword">lexical syntax</span>
  <button class="modal-open" id="Char_10_3" title="Multi-file references" data-urls="#Char_13_14 line 13; ../strategies.sdf3/#Char_59_31 line 59; ../terms.sdf3/#Char_21_23 line 21">Char</button>     = <span class="cons_Lit">"'"</span> <a href="#CharChar_8_20" id="CharChar_10_18" title="Defined at line 8, 11, 12">CharChar</a> <span class="cons_Lit">"'"</span>
  <a href="#CharChar_10_18" id="CharChar_11_3" title="Referenced at line 10">CharChar</a> = ~[\'\\\n\r]
  <a href="#CharChar_10_18" id="CharChar_12_3" title="Referenced at line 10">CharChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\]
  <span id="Id_13_3" title="Not referenced">Id</span>       = <a href="#Char_8_15" id="Char_13_14" title="Defined at line 8, 10">Char</a> {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
