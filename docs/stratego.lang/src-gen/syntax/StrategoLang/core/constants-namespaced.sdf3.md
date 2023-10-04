---
title: constants-namespaced.sdf3
hide:
  - toc
---

# `constants-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/constants-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/constants-namespaced.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/strategies-namespaced.sdf3#StrategoLang/core/constants-namespaced_103_141" id="StrategoLang/core/constants-namespaced_7_45" title="Referenced at ../../sugar/strategies-namespaced.sdf3 line 5">StrategoLang/core/constants-namespaced</a>


<span class="keyword">sorts</span> <span id="Int_54_57" title="Not referenced locally, nor via imports">Int</span><span class="keyword">-LEX</span> <span id="Real_62_66" title="Not referenced locally, nor via imports">Real</span><span class="keyword">-LEX</span> <span id="String_71_77" title="Not referenced locally, nor via imports">String</span><span class="keyword">-LEX</span> <span id="StrChar_82_89" title="Not referenced locally, nor via imports">StrChar</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="../terms-namespaced.sdf3#StrategoLang-Int_788_804" id="StrategoLang-Int_113_129" title="Referenced at ../terms-namespaced.sdf3 line 30; ../../gradual-types/internal-namespaced.sdf3 line 79; ../../sugar/strategies-namespaced.sdf3 line 56">StrategoLang-Int</a> = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ { }
  <a href="../terms-namespaced.sdf3#StrategoLang-Real_839_856" id="StrategoLang-Real_151_168" title="Referenced at ../terms-namespaced.sdf3 line 31; ../../sugar/strategies-namespaced.sdf3 line 57">StrategoLang-Real</a> = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ [\.] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ { }
  <a href="../signatures-namespaced.sdf3#StrategoLang-String_1764_1783" id="StrategoLang-String_202_221" title="Referenced at ../signatures-namespaced.sdf3 line 49; ../strategies-namespaced.sdf3 line 67; ../terms-namespaced.sdf3 line 34; ../../gradual-types/internal-namespaced.sdf3 line 96; ../../sugar/strategies-namespaced.sdf3 line 59">StrategoLang-String</a> = <span class="cons_Lit">"\""</span> <a href="#StrategoLang-StrChar_262_282" id="StrategoLang-StrChar_229_249" title="Defined at line 11, 12">StrategoLang-StrChar</a>* <span class="cons_Lit">"\""</span> { }
  <a href="#StrategoLang-StrChar_229_249" id="StrategoLang-StrChar_262_282" title="Referenced at line 10">StrategoLang-StrChar</a> = ~[\"\\] { }
  <a href="#StrategoLang-StrChar_229_249" id="StrategoLang-StrChar_299_319" title="Referenced at line 10">StrategoLang-StrChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\] { }

</code></pre></td></tr></tbody></table></div>