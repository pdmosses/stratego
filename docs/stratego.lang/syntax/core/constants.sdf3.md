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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/constants_1_8" title="Multi-file references" data-urls="../main.sdf3/#core/constants_4_3 line 4; ../signatures.sdf3/#core/constants_5_3 line 5; ../strategies.sdf3/#core/constants_5_3 line 5; ../terms.sdf3/#core/constants_5_3 line 5; ../../gradual-types/internal.sdf3/#core/constants_5_3 line 5; ../../sugar/constants.sdf3/#core/constants_5_3 line 5; ../../sugar/strategies.sdf3/#core/constants_4_3 line 4">core/constants</button>

<span class="keyword">lexical sorts</span> <button class="modal-open" id="Int_3_15" title="Multi-file references" data-urls="../terms.sdf3/#Int_27_21 line 27; ../../gradual-types/internal.sdf3/#Int_44_80 line 44, 61, 78, 80, 81; ../../sugar/strategies.sdf3/#Int_57_31 line 57">Int</button> <button class="modal-open" id="Real_3_19" title="Multi-file references" data-urls="../terms.sdf3/#Real_28_21 line 28; ../../sugar/strategies.sdf3/#Real_58_31 line 58">Real</button> <button class="modal-open" id="String_3_24" title="Multi-file references" data-urls="../signatures.sdf3/#String_41_24 line 41, 45; ../strategies.sdf3/#String_64_27 line 64; ../terms.sdf3/#String_29_21 line 29, 31; ../../gradual-types/internal.sdf3/#String_83_73 line 83, 103; ../../sugar/strategies.sdf3/#String_51_32 line 51, 52, 56, 60">String</button> <a href="#StrChar_9_18" id="StrChar_3_31" title="Referenced at line 9">StrChar</a>
<span class="keyword">lexical syntax</span>
  <button class="modal-open" id="Int_5_3" title="Multi-file references" data-urls="../terms.sdf3/#Int_27_21 line 27; ../../gradual-types/internal.sdf3/#Int_44_80 line 44, 61, 78, 80, 81; ../../sugar/strategies.sdf3/#Int_57_31 line 57">Int</button>     = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

  <button class="modal-open" id="Real_7_3" title="Multi-file references" data-urls="../terms.sdf3/#Real_28_21 line 28; ../../sugar/strategies.sdf3/#Real_58_31 line 58">Real</button>    = [\-]? [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+ [\.] [<span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>]+

  <button class="modal-open" id="String_9_3" title="Multi-file references" data-urls="../signatures.sdf3/#String_41_24 line 41, 45; ../strategies.sdf3/#String_64_27 line 64; ../terms.sdf3/#String_29_21 line 29, 31; ../../gradual-types/internal.sdf3/#String_83_73 line 83, 103; ../../sugar/strategies.sdf3/#String_51_32 line 51, 52, 56, 60">String</button>  = <span class="cons_Lit">"\""</span> <a href="#StrChar_3_31" id="StrChar_9_18" title="Defined at line 3, 11, 12">StrChar</a>* <span class="cons_Lit">"\""</span>

  <a href="#StrChar_9_18" id="StrChar_11_3" title="Referenced at line 9">StrChar</a> = ~[\"\\]
  <a href="#StrChar_9_18" id="StrChar_12_3" title="Referenced at line 9">StrChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
