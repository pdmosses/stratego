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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../terms.sdf3#sugar/constants_61_76" id="sugar/constants_7_22" title="Referenced at ../terms.sdf3 line 5">sugar/constants</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_34_50" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/constants.sdf3#core/constants_7_21" id="core/constants_53_67" title="Defined at ../../core/constants.sdf3 line 1">core/constants</a>
  <a href="../string-quotations.sdf3#sugar/string-quotations_7_30" id="sugar/string-quotations_70_93" title="Defined at ../string-quotations.sdf3 line 1">sugar/string-quotations</a>

<span class="keyword">lexical sorts</span> <a href="#Char_238_242" id="Char_109_113" title="Referenced at line 13; ../strategies.sdf3 line 59; ../terms.sdf3 line 21">Char</a> <a href="#CharChar_155_163" id="CharChar_114_122" title="Referenced at line 10">CharChar</a>
<span class="keyword">lexical syntax</span>
  <a href="#Char_238_242" id="Char_140_144" title="Referenced at line 13; ../strategies.sdf3 line 59; ../terms.sdf3 line 21">Char</a>     = <span class="cons_Lit">"'"</span> <a href="#CharChar_114_122" id="CharChar_155_163" title="Defined at line 8, 11, 12">CharChar</a> <span class="cons_Lit">"'"</span>
  <a href="#CharChar_155_163" id="CharChar_170_178" title="Referenced at line 10">CharChar</a> = ~[\'\\\n\r]
  <a href="#CharChar_155_163" id="CharChar_195_203" title="Referenced at line 10">CharChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\]
  <span id="Id_227_229" title="Not referenced locally, nor via imports">Id</span>       = <a href="#Char_109_113" id="Char_238_242" title="Defined at line 8, 10">Char</a> {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>