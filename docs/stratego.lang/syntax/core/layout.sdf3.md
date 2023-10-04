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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../modules.sdf3#core/layout_50_61" id="core/layout_7_18" title="Referenced at ../modules.sdf3 line 5">core/layout</a>

<span class="keyword">lexical sorts</span> <a href="#Ws_389_391" id="Ws_34_36" title="Referenced at line 20">Ws</a> <a href="#ShortCom_350_358" id="ShortCom_37_45" title="Referenced at line 18">ShortCom</a> <a href="#LongCom_370_377" id="LongCom_46_53" title="Referenced at line 19">LongCom</a> <a href="#CommChar_175_183" id="CommChar_54_62" title="Referenced at line 7">CommChar</a> <a href="#Asterisk_286_294" id="Asterisk_63_71" title="Referenced at line 14">Asterisk</a> <a href="#Eof_306_309" id="Eof_72_75" title="Referenced at line 15">Eof</a>
<span class="keyword">lexical syntax</span>
  <a href="#Ws_389_391" id="Ws_93_95" title="Referenced at line 20">Ws</a>       = [\t\ \n\r]
  <a href="#ShortCom_350_358" id="ShortCom_117_125" title="Referenced at line 18">ShortCom</a> = <span class="cons_Lit">"//"</span> ~[\n\r]* ([\n\r] | <a href="#Eof_72_75" id="Eof_152_155" title="Defined at line 3, 8">Eof</a>)
  <a href="#LongCom_370_377" id="LongCom_159_166" title="Referenced at line 19">LongCom</a>  = <span class="cons_Lit">"/*"</span> <a href="#CommChar_54_62" id="CommChar_175_183" title="Defined at line 3, 9, 11">CommChar</a>* <span class="cons_Lit">"*/"</span>
  <a href="#Eof_306_309" id="Eof_192_195" title="Referenced at line 15">Eof</a>      =
  <a href="#CommChar_175_183" id="CommChar_205_213" title="Referenced at line 7">CommChar</a> = ~[\*]
  <a href="#Asterisk_286_294" id="Asterisk_224_232" title="Referenced at line 14">Asterisk</a> = <span class="cons_Lit">"*"</span>
  <a href="#CommChar_175_183" id="CommChar_241_249" title="Referenced at line 7">CommChar</a> = <a href="#Asterisk_63_71" id="Asterisk_252_260" title="Defined at line 3, 10">Asterisk</a> 

<span class="keyword">lexical restrictions</span>
  <a href="#Asterisk_63_71" id="Asterisk_286_294" title="Defined at line 3, 10">Asterisk</a> -/- [\/]
  <a href="#Eof_72_75" id="Eof_306_309" title="Defined at line 3, 8">Eof</a>      -/- ~[]

<span class="keyword">lexical syntax</span>
  <span class="keyword">LAYOUT</span> = <a href="#ShortCom_37_45" id="ShortCom_350_358" title="Defined at line 3, 6">ShortCom</a>
  <span class="keyword">LAYOUT</span> = <a href="#LongCom_46_53" id="LongCom_370_377" title="Defined at line 3, 7">LongCom</a>
  <span class="keyword">LAYOUT</span> = <a href="#Ws_34_36" id="Ws_389_391" title="Defined at line 3, 5">Ws</a>

<span class="keyword">context-free restrictions</span>
  <span class="keyword">LAYOUT</span>? -/- [\ \t\n\r]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\*]
  <span class="keyword">LAYOUT</span>? -/- [\/].[\/]

</code></pre></td></tr></tbody></table></div>