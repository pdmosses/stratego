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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/core/constants-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/core/constants-namespaced_4_3 line 4; ../signatures-namespaced.sdf3/#StrategoLang/core/constants-namespaced_5_3 line 5; ../strategies-namespaced.sdf3/#StrategoLang/core/constants-namespaced_5_3 line 5; ../terms-namespaced.sdf3/#StrategoLang/core/constants-namespaced_5_3 line 5; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang/core/constants-namespaced_5_3 line 5; ../../sugar/constants-namespaced.sdf3/#StrategoLang/core/constants-namespaced_5_3 line 5; ../../sugar/strategies-namespaced.sdf3/#StrategoLang/core/constants-namespaced_5_3 line 5">StrategoLang/core/constants-namespaced</button>


<span class="keyword">sorts</span> <span id="Int_4_7" title="Not referenced">Int</span><span class="keyword">-LEX</span> <span id="Real_4_15" title="Not referenced">Real</span><span class="keyword">-LEX</span> <span id="String_4_24" title="Not referenced">String</span><span class="keyword">-LEX</span> <span id="StrChar_4_35" title="Not referenced">StrChar</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="StrategoLang-Int_8_3" title="Multi-file references" data-urls="../terms-namespaced.sdf3/#StrategoLang-Int_30_30 line 30; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Int_44_93 line 44, 61, 76, 78, 79; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-Int_56_37 line 56">StrategoLang-Int</button> = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ { }
  <button class="modal-open" id="StrategoLang-Real_9_3" title="Multi-file references" data-urls="../terms-namespaced.sdf3/#StrategoLang-Real_31_31 line 31; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-Real_57_38 line 57">StrategoLang-Real</button> = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ [\.] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ { }
  <button class="modal-open" id="StrategoLang-String_10_3" title="Multi-file references" data-urls="../signatures-namespaced.sdf3/#StrategoLang-String_46_35 line 46, 49; ../strategies-namespaced.sdf3/#StrategoLang-String_67_40 line 67; ../terms-namespaced.sdf3/#StrategoLang-String_32_30 line 32, 34; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-String_81_86 line 81, 96; ../../sugar/strategies-namespaced.sdf3/#StrategoLang-String_50_45 line 50, 51, 55, 59">StrategoLang-String</button> = <span class="cons_Lit">"\""</span> <a href="#StrategoLang-StrChar_11_3" id="StrategoLang-StrChar_10_30" title="Defined at line 11, 12">StrategoLang-StrChar</a>* <span class="cons_Lit">"\""</span> { }
  <a href="#StrategoLang-StrChar_10_30" id="StrategoLang-StrChar_11_3" title="Referenced at line 10">StrategoLang-StrChar</a> = ~[\"\\] { }
  <a href="#StrategoLang-StrChar_10_30" id="StrategoLang-StrChar_12_3" title="Referenced at line 10">StrategoLang-StrChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\] { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
