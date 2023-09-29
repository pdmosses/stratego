---
title: layout-namespaced.sdf3
---

# `layout-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/layout-namespaced.sdf3]

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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../modules-namespaced.sdf3#StrategoLang/core/layout-namespaced_99_134" id="StrategoLang/core/layout-namespaced_7_42" title="Referenced at ../modules-namespaced.sdf3 line 5">StrategoLang/core/layout-namespaced</a>


<span class="keyword">sorts</span> <span id="Ws_51_53" title="Not referenced locally, nor via imports">Ws</span><span class="keyword">-LEX</span> <span id="ShortCom_58_66" title="Not referenced locally, nor via imports">ShortCom</span><span class="keyword">-LEX</span> <span id="LongCom_71_78" title="Not referenced locally, nor via imports">LongCom</span><span class="keyword">-LEX</span> <span id="CommChar_83_91" title="Not referenced locally, nor via imports">CommChar</span><span class="keyword">-LEX</span> <span id="Asterisk_96_104" title="Not referenced locally, nor via imports">Asterisk</span><span class="keyword">-LEX</span> <span id="Eof_109_112" title="Not referenced locally, nor via imports">Eof</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Ws_633_648" id="StrategoLang-Ws_136_151" title="Referenced at line 25">StrategoLang-Ws</a> = [\t\ \n\r] { }
  <a href="#StrategoLang-ShortCom_560_581" id="StrategoLang-ShortCom_171_192" title="Referenced at line 23">StrategoLang-ShortCom</a> = <span class="cons_Lit">"//"</span> ~[\n\r]* [\n\r] | <a href="#StrategoLang-Eof_303_319" id="StrategoLang-Eof_218_234" title="Defined at line 11">StrategoLang-Eof</a> { }
  <a href="#StrategoLang-LongCom_597_617" id="StrategoLang-LongCom_241_261" title="Referenced at line 24">StrategoLang-LongCom</a> = <span class="cons_Lit">"/*"</span> <a href="#StrategoLang-CommChar_328_349" id="StrategoLang-CommChar_269_290" title="Defined at line 12, 14">StrategoLang-CommChar</a>* <span class="cons_Lit">"*/"</span> { }
  <a href="#StrategoLang-Eof_506_522" id="StrategoLang-Eof_303_319" title="Referenced at line 19">StrategoLang-Eof</a> = { }
  <a href="#StrategoLang-CommChar_269_290" id="StrategoLang-CommChar_328_349" title="Referenced at line 10">StrategoLang-CommChar</a> = ~[\*] { }
  <a href="#StrategoLang-Asterisk_473_494" id="StrategoLang-Asterisk_364_385" title="Referenced at line 18">StrategoLang-Asterisk</a> = <span class="cons_Lit">"*"</span> { }
  <a href="#StrategoLang-CommChar_269_290" id="StrategoLang-CommChar_398_419" title="Referenced at line 10">StrategoLang-CommChar</a> = <a href="#StrategoLang-Asterisk_364_385" id="StrategoLang-Asterisk_422_443" title="Defined at line 13">StrategoLang-Asterisk</a> { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-Asterisk_364_385" id="StrategoLang-Asterisk_473_494" title="Defined at line 13">StrategoLang-Asterisk</a> -/- [\/]
  <a href="#StrategoLang-Eof_303_319" id="StrategoLang-Eof_506_522" title="Defined at line 11">StrategoLang-Eof</a> -/- ~[ ]

<span class="keyword">lexical syntax</span>

  <span class="keyword">LAYOUT</span> = <a href="#StrategoLang-ShortCom_171_192" id="StrategoLang-ShortCom_560_581" title="Defined at line 9">StrategoLang-ShortCom</a> { }
  <span class="keyword">LAYOUT</span> = <a href="#StrategoLang-LongCom_241_261" id="StrategoLang-LongCom_597_617" title="Defined at line 10">StrategoLang-LongCom</a> { }
  <span class="keyword">LAYOUT</span> = <a href="#StrategoLang-Ws_136_151" id="StrategoLang-Ws_633_648" title="Defined at line 8">StrategoLang-Ws</a> { }

<span class="keyword">context-free restrictions</span>

  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]

</code></pre></td></tr></tbody></table></div>