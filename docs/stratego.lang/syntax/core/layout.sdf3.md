---
title: layout.sdf3
hide:
  - toc
---

# `layout.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/layout.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/layout.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/layout.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/layout_1_8" title="Multi-file references" data-urls="../main.sdf3/#core/layout_6_3 line 6; ../modules.sdf3/#core/layout_5_3 line 5">core/layout</button>

<span class="keyword">lexical sorts</span> <a href="#Ws_20_12" id="Ws_3_15" title="Referenced at line 20">Ws</a> <a href="#ShortCom_18_12" id="ShortCom_3_18" title="Referenced at line 18">ShortCom</a> <a href="#LongCom_19_12" id="LongCom_3_27" title="Referenced at line 19">LongCom</a> <a href="#CommChar_7_19" id="CommChar_3_35" title="Referenced at line 7">CommChar</a> <a href="#Asterisk_11_14" id="Asterisk_3_44" title="Referenced at line 11, 14">Asterisk</a> <a href="#Eof_6_38" id="Eof_3_53" title="Referenced at line 6, 15">Eof</a>
<span class="keyword">lexical syntax</span>
  <a href="#Ws_20_12" id="Ws_5_3" title="Referenced at line 20">Ws</a>       = [\t\ \n\r]
  <a href="#ShortCom_18_12" id="ShortCom_6_3" title="Referenced at line 18">ShortCom</a> = <span class="cons_Lit">"//"</span> ~[\n\r]* ([\n\r] | <a href="#Eof_3_53" id="Eof_6_38" title="Defined at line 3, 8">Eof</a>)
  <a href="#LongCom_19_12" id="LongCom_7_3" title="Referenced at line 19">LongCom</a>  = <span class="cons_Lit">"/*"</span> <a href="#CommChar_3_35" id="CommChar_7_19" title="Defined at line 3, 9, 11">CommChar</a>* <span class="cons_Lit">"*/"</span>
  <a href="#Eof_6_38" id="Eof_8_3" title="Referenced at line 6, 15">Eof</a>      =
  <a href="#CommChar_7_19" id="CommChar_9_3" title="Referenced at line 7">CommChar</a> = ~[\*]
  <a href="#Asterisk_11_14" id="Asterisk_10_3" title="Referenced at line 11, 14">Asterisk</a> = <span class="cons_Lit">"*"</span>
  <a href="#CommChar_7_19" id="CommChar_11_3" title="Referenced at line 7">CommChar</a> = <a href="#Asterisk_3_44" id="Asterisk_11_14" title="Defined at line 3, 10">Asterisk</a> 

<span class="keyword">lexical restrictions</span>
  <a href="#Asterisk_3_44" id="Asterisk_14_3" title="Defined at line 3, 10">Asterisk</a> -/- [\/]
  <a href="#Eof_3_53" id="Eof_15_3" title="Defined at line 3, 8">Eof</a>      -/- ~[]

<span class="keyword">lexical syntax</span>
  <span class="keyword">LAYOUT</span> = <a href="#ShortCom_3_18" id="ShortCom_18_12" title="Defined at line 3, 6">ShortCom</a>
  <span class="keyword">LAYOUT</span> = <a href="#LongCom_3_27" id="LongCom_19_12" title="Defined at line 3, 7">LongCom</a>
  <span class="keyword">LAYOUT</span> = <a href="#Ws_3_15" id="Ws_20_12" title="Defined at line 3, 5">Ws</a>

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
