---
title: layout-namespaced.sdf3
hide:
  - toc
---

# `layout-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/layout-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/layout-namespaced.sdf3 "The source file on GitHub"

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
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/core/layout-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/core/layout-namespaced_6_3 line 6; ../modules-namespaced.sdf3/#StrategoLang/core/layout-namespaced_5_3 line 5">StrategoLang/core/layout-namespaced</button>


<span class="keyword">sorts</span> <span id="Ws_4_7" title="Not referenced">Ws</span><span class="keyword">-LEX</span> <span id="ShortCom_4_14" title="Not referenced">ShortCom</span><span class="keyword">-LEX</span> <span id="LongCom_4_27" title="Not referenced">LongCom</span><span class="keyword">-LEX</span> <span id="CommChar_4_39" title="Not referenced">CommChar</span><span class="keyword">-LEX</span> <span id="Asterisk_4_52" title="Not referenced">Asterisk</span><span class="keyword">-LEX</span> <span id="Eof_4_65" title="Not referenced">Eof</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Ws_25_12" id="StrategoLang-Ws_8_3" title="Referenced at line 25">StrategoLang-Ws</a> = [\t\ \n\r] { }
  <a href="#StrategoLang-ShortCom_23_12" id="StrategoLang-ShortCom_9_3" title="Referenced at line 23">StrategoLang-ShortCom</a> = <span class="cons_Lit">"//"</span> ~[\n\r]* [\n\r] | <a href="#StrategoLang-Eof_11_3" id="StrategoLang-Eof_9_50" title="Defined at line 11">StrategoLang-Eof</a> { }
  <a href="#StrategoLang-LongCom_24_12" id="StrategoLang-LongCom_10_3" title="Referenced at line 24">StrategoLang-LongCom</a> = <span class="cons_Lit">"/*"</span> <a href="#StrategoLang-CommChar_12_3" id="StrategoLang-CommChar_10_31" title="Defined at line 12, 14">StrategoLang-CommChar</a>* <span class="cons_Lit">"*/"</span> { }
  <a href="#StrategoLang-Eof_9_50" id="StrategoLang-Eof_11_3" title="Referenced at line 9, 19">StrategoLang-Eof</a> = { }
  <a href="#StrategoLang-CommChar_10_31" id="StrategoLang-CommChar_12_3" title="Referenced at line 10">StrategoLang-CommChar</a> = ~[\*] { }
  <a href="#StrategoLang-Asterisk_14_27" id="StrategoLang-Asterisk_13_3" title="Referenced at line 14, 18">StrategoLang-Asterisk</a> = <span class="cons_Lit">"*"</span> { }
  <a href="#StrategoLang-CommChar_10_31" id="StrategoLang-CommChar_14_3" title="Referenced at line 10">StrategoLang-CommChar</a> = <a href="#StrategoLang-Asterisk_13_3" id="StrategoLang-Asterisk_14_27" title="Defined at line 13">StrategoLang-Asterisk</a> { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-Asterisk_13_3" id="StrategoLang-Asterisk_18_3" title="Defined at line 13">StrategoLang-Asterisk</a> -/- [\/]
  <a href="#StrategoLang-Eof_11_3" id="StrategoLang-Eof_19_3" title="Defined at line 11">StrategoLang-Eof</a> -/- ~[ ]

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span> = <a href="#StrategoLang-ShortCom_9_3" id="StrategoLang-ShortCom_23_12" title="Defined at line 9">StrategoLang-ShortCom</a> { }
  <span class="keyword">LAYOUT</span> = <a href="#StrategoLang-LongCom_10_3" id="StrategoLang-LongCom_24_12" title="Defined at line 10">StrategoLang-LongCom</a> { }
  <span class="keyword">LAYOUT</span> = <a href="#StrategoLang-Ws_8_3" id="StrategoLang-Ws_25_12" title="Defined at line 8">StrategoLang-Ws</a> { }

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
