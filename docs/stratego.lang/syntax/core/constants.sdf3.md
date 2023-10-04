---
title: constants.sdf3
hide:
  - toc
---

# `constants.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/constants.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/constants.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/constants.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/strategies.sdf3#core/constants_53_67" id="core/constants_7_21" title="Referenced at ../../sugar/strategies.sdf3 line 4">core/constants</a>

<span class="keyword">lexical sorts</span> <a href="../terms.sdf3#Int_480_483" id="Int_37_40" title="Referenced at ../terms.sdf3 line 27; ../../gradual-types/internal.sdf3 line 81; ../../sugar/strategies.sdf3 line 57">Int</a> <a href="../terms.sdf3#Real_504_508" id="Real_41_45" title="Referenced at ../terms.sdf3 line 28; ../../sugar/strategies.sdf3 line 58">Real</a> <a href="../signatures.sdf3#String_1131_1137" id="String_46_52" title="Referenced at ../signatures.sdf3 line 45; ../strategies.sdf3 line 64; ../terms.sdf3 line 31; ../../gradual-types/internal.sdf3 line 103; ../../sugar/strategies.sdf3 line 60">String</a> <a href="#StrChar_157_164" id="StrChar_53_60" title="Referenced at line 9">StrChar</a>
<span class="keyword">lexical syntax</span>
  <a href="../terms.sdf3#Int_480_483" id="Int_78_81" title="Referenced at ../terms.sdf3 line 27; ../../gradual-types/internal.sdf3 line 81; ../../sugar/strategies.sdf3 line 57">Int</a>     = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

  <a href="../terms.sdf3#Real_504_508" id="Real_104_108" title="Referenced at ../terms.sdf3 line 28; ../../sugar/strategies.sdf3 line 58">Real</a>    = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ [\.] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

  <a href="../signatures.sdf3#String_1131_1137" id="String_142_148" title="Referenced at ../signatures.sdf3 line 45; ../strategies.sdf3 line 64; ../terms.sdf3 line 31; ../../gradual-types/internal.sdf3 line 103; ../../sugar/strategies.sdf3 line 60">String</a>  = <span class="cons_Lit">"\""</span> <a href="#StrChar_53_60" id="StrChar_157_164" title="Defined at line 3, 11, 12">StrChar</a>* <span class="cons_Lit">"\""</span>

  <a href="#StrChar_157_164" id="StrChar_174_181" title="Referenced at line 9">StrChar</a> = ~[\"\\]
  <a href="#StrChar_157_164" id="StrChar_194_201" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\]

</code></pre></td></tr></tbody></table></div>