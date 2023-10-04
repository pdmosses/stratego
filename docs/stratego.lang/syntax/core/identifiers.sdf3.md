---
title: identifiers.sdf3
hide:
  - toc
---

# `identifiers.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/identifiers.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/identifiers.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/identifiers.sdf3 "The source file on GitHub"

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
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/terms.sdf3#core/identifiers_42_58" id="core/identifiers_7_23" title="Referenced at ../../sugar/terms.sdf3 line 4">core/identifiers</a>

<span class="keyword">lexical sorts</span> <a href="#ModName_178_185" id="ModName_39_46" title="Referenced at line 8; ../modules.sdf3 line 45; ../strategies.sdf3 line 84">ModName</a> <a href="#ModNamePart_87_98" id="ModNamePart_47_58" title="Referenced at line 5; ../../gradual-types/internal.sdf3 line 13">ModNamePart</a>
<span class="keyword">lexical syntax</span>
  <a href="#ModName_178_185" id="ModName_76_83" title="Referenced at line 8; ../modules.sdf3 line 45; ../strategies.sdf3 line 84">ModName</a> = {<a href="#ModNamePart_47_58" id="ModNamePart_87_98" title="Defined at line 3, 6">ModNamePart</a> <span class="cons_Lit">"/"</span>}+
  <a href="#ModNamePart_87_98" id="ModNamePart_107_118" title="Referenced at line 5; ../../gradual-types/internal.sdf3 line 13">ModNamePart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]*
<span class="keyword">lexical restrictions</span>
  <a href="#ModName_39_46" id="ModName_178_185" title="Defined at line 3, 5, 10, 11, 12, 13, 14">ModName</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]
<span class="keyword">context-free syntax</span>
  <a href="#ModName_178_185" id="ModName_232_239" title="Referenced at line 8; ../modules.sdf3 line 45; ../strategies.sdf3 line 84">ModName</a> = <span class="cons_Lit">"imports"</span>     {<span class="keyword">reject</span>}
  <a href="#ModName_178_185" id="ModName_267_274" title="Referenced at line 8; ../modules.sdf3 line 45; ../strategies.sdf3 line 84">ModName</a> = <span class="cons_Lit">"overlays"</span>    {<span class="keyword">reject</span>}
  <a href="#ModName_178_185" id="ModName_302_309" title="Referenced at line 8; ../modules.sdf3 line 45; ../strategies.sdf3 line 84">ModName</a> = <span class="cons_Lit">"rules"</span>       {<span class="keyword">reject</span>}
  <a href="#ModName_178_185" id="ModName_337_344" title="Referenced at line 8; ../modules.sdf3 line 45; ../strategies.sdf3 line 84">ModName</a> = <span class="cons_Lit">"signature"</span>   {<span class="keyword">reject</span>}
  <a href="#ModName_178_185" id="ModName_372_379" title="Referenced at line 8; ../modules.sdf3 line 45; ../strategies.sdf3 line 84">ModName</a> = <span class="cons_Lit">"strategies"</span>  {<span class="keyword">reject</span>}

<span class="keyword">lexical sorts</span> <a href="#Id_1017_1019" id="Id_420_422" title="Referenced at line 37; ../signatures.sdf3 line 44; ../strategies.sdf3 line 37; ../terms.sdf3 line 30; ../../deduplicated.sdf3 line 73; ../../gradual-types/internal.sdf3 line 103; ../../gradual-types/overlays.sdf3 line 13; ../../gradual-types/signatures.sdf3 line 19; ../../sugar/dynamic-rules.sdf3 line 53; ../../sugar/overlays.sdf3 line 11">Id</a> <a href="#LId_1039_1042" id="LId_423_426" title="Referenced at line 38; ../../sugar/terms.sdf3 line 9">LId</a> <a href="#LCID_1068_1072" id="LCID_427_431" title="Referenced at line 39; ../signatures.sdf3 line 33; ../../deduplicated.sdf3 line 26">LCID</a> <a href="#UCID_1097_1101" id="UCID_432_436" title="Referenced at line 40; ../signatures.sdf3 line 34; ../../deduplicated.sdf3 line 74; ../../gradual-types/signatures.sdf3 line 20">UCID</a> <a href="../../deduplicated.sdf3#SortVar_2172_2179" id="SortVar_437_444" title="Referenced at ../../deduplicated.sdf3 line 75; ../../gradual-types/signatures.sdf3 line 22">SortVar</a> <a href="#BuiltInType_850_861" id="BuiltInType_445_456" title="Referenced at line 29">BuiltInType</a> <span id="SomeSort_457_465" title="Not referenced locally, nor via imports">SomeSort</span>
<span class="keyword">lexical syntax</span>
<span class="layout">// Removed leading underscore option, nearly always conflicts with Term.BuildDefault</span>
<span class="layout">//  Id   = [a-zA-Z\_] [a-zA-Z0-9\'\-\_]*</span>
<span class="layout">//  LId  = [a-zA-Z\_] [a-zA-Z0-9\'\-\_]* "*"</span>
  <a href="#Id_1017_1019" id="Id_654_656" title="Referenced at line 37; ../signatures.sdf3 line 44; ../strategies.sdf3 line 37; ../terms.sdf3 line 30; ../../deduplicated.sdf3 line 73; ../../gradual-types/internal.sdf3 line 103; ../../gradual-types/overlays.sdf3 line 13; ../../gradual-types/signatures.sdf3 line 19; ../../sugar/dynamic-rules.sdf3 line 53; ../../sugar/overlays.sdf3 line 11">Id</a>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*
  <a href="#LId_1039_1042" id="LId_691_694" title="Referenced at line 38; ../../sugar/terms.sdf3 line 9">LId</a>  = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span>
  <a href="#Id_1017_1019" id="Id_732_734" title="Referenced at line 37; ../signatures.sdf3 line 44; ../strategies.sdf3 line 37; ../terms.sdf3 line 30; ../../deduplicated.sdf3 line 73; ../../gradual-types/internal.sdf3 line 103; ../../gradual-types/overlays.sdf3 line 13; ../../gradual-types/signatures.sdf3 line 19; ../../sugar/dynamic-rules.sdf3 line 53; ../../sugar/overlays.sdf3 line 11">Id</a>   = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+

  <a href="#LCID_1068_1072" id="LCID_754_758" title="Referenced at line 39; ../signatures.sdf3 line 33; ../../deduplicated.sdf3 line 26">LCID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*
  <a href="#UCID_1097_1101" id="UCID_788_792" title="Referenced at line 40; ../signatures.sdf3 line 34; ../../deduplicated.sdf3 line 74; ../../gradual-types/signatures.sdf3 line 20">UCID</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*

  <a href="../../deduplicated.sdf3#SortVar_2172_2179" id="SortVar_823_830" title="Referenced at ../../deduplicated.sdf3 line 75; ../../gradual-types/signatures.sdf3 line 22">SortVar</a> = <a href="#LCID_427_431" id="LCID_833_837" title="Defined at line 16, 25, 47">LCID</a>
  <a href="../../deduplicated.sdf3#SortVar_2172_2179" id="SortVar_840_847" title="Referenced at ../../deduplicated.sdf3 line 75; ../../gradual-types/signatures.sdf3 line 22">SortVar</a> = <a href="#BuiltInType_445_456" id="BuiltInType_850_861" title="Defined at line 16, 30, 31, 32, 33">BuiltInType</a> {<span class="keyword">reject</span>}
  <a href="#BuiltInType_850_861" id="BuiltInType_873_884" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"string"</span>
  <a href="#BuiltInType_850_861" id="BuiltInType_898_909" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"int"</span>
  <a href="#BuiltInType_850_861" id="BuiltInType_920_931" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"real"</span>
  <a href="#BuiltInType_850_861" id="BuiltInType_943_954" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"blob"</span>

<span class="keyword">lexical restrictions</span>
  <a href="#Id_420_422" id="Id_988_990" title="Defined at line 16, 21, 23, 43, 44, 45">Id</a>   -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#Id_420_422" id="Id_1017_1019" title="Defined at line 16, 21, 23, 43, 44, 45">Id</a>   -/- [\-].~[\&gt;]
  <a href="#LId_423_426" id="LId_1039_1042" title="Defined at line 16, 22">LId</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#LCID_427_431" id="LCID_1068_1072" title="Defined at line 16, 25, 47">LCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#UCID_432_436" id="UCID_1097_1101" title="Defined at line 16, 26, 48">UCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

<span class="keyword">lexical syntax</span>
  <a href="#Id_1017_1019" id="Id_1142_1144" title="Referenced at line 37; ../signatures.sdf3 line 44; ../strategies.sdf3 line 37; ../terms.sdf3 line 30; ../../deduplicated.sdf3 line 73; ../../gradual-types/internal.sdf3 line 103; ../../gradual-types/overlays.sdf3 line 13; ../../gradual-types/signatures.sdf3 line 19; ../../sugar/dynamic-rules.sdf3 line 53; ../../sugar/overlays.sdf3 line 11">Id</a>   = <span class="cons_Lit">"_"</span>      {<span class="keyword">reject</span>}
  <a href="#Id_1017_1019" id="Id_1169_1171" title="Referenced at line 37; ../signatures.sdf3 line 44; ../strategies.sdf3 line 37; ../terms.sdf3 line 30; ../../deduplicated.sdf3 line 73; ../../gradual-types/internal.sdf3 line 103; ../../gradual-types/overlays.sdf3 line 13; ../../gradual-types/signatures.sdf3 line 19; ../../sugar/dynamic-rules.sdf3 line 53; ../../sugar/overlays.sdf3 line 11">Id</a>   = <span class="cons_Lit">"'"</span>      {<span class="keyword">reject</span>}
  <a href="#Id_1017_1019" id="Id_1196_1198" title="Referenced at line 37; ../signatures.sdf3 line 44; ../strategies.sdf3 line 37; ../terms.sdf3 line 30; ../../deduplicated.sdf3 line 73; ../../gradual-types/internal.sdf3 line 103; ../../gradual-types/overlays.sdf3 line 13; ../../gradual-types/signatures.sdf3 line 19; ../../sugar/dynamic-rules.sdf3 line 53; ../../sugar/overlays.sdf3 line 11">Id</a>   = <a href="#Keyword_1317_1324" id="Keyword_1203_1210" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}
  <span id="Lid_1223_1226" title="Not referenced locally, nor via imports">Lid</span>  = <a href="#Keyword_1317_1324" id="Keyword_1230_1237" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}
  <a href="#LCID_1068_1072" id="LCID_1250_1254" title="Referenced at line 39; ../signatures.sdf3 line 33; ../../deduplicated.sdf3 line 26">LCID</a> = <a href="#Keyword_1317_1324" id="Keyword_1257_1264" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}
  <a href="#UCID_1097_1101" id="UCID_1277_1281" title="Referenced at line 40; ../signatures.sdf3 line 34; ../../deduplicated.sdf3 line 74; ../../gradual-types/signatures.sdf3 line 20">UCID</a> = <a href="#Keyword_1317_1324" id="Keyword_1284_1291" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}

<span class="keyword">lexical sorts</span> <a href="#Keyword_1284_1291" id="Keyword_1317_1324" title="Referenced at line 48">Keyword</a>
<span class="keyword">lexical syntax</span>
  <a href="#Keyword_1284_1291" id="Keyword_1342_1349" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"all"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1360_1367" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"constructors"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1387_1394" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"fail"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1406_1413" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"id"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1423_1430" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"in"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1440_1447" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"let"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1458_1465" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"module"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1479_1486" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"not"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1497_1504" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"one"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1515_1522" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"overlays"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1538_1545" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"prim"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1557_1564" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"proceed"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1579_1586" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"rules"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1599_1606" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"script"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1620_1627" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"signature"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1644_1651" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"some"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1663_1670" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"sorts"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1683_1690" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"strategies"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1708_1715" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"stratego"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1731_1738" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"test"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1750_1757" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"where"</span>
<span class="layout">//  Keyword = "with"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1791_1798" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"import-term"</span>
  <a href="#Keyword_1284_1291" id="Keyword_1817_1824" title="Referenced at line 48">Keyword</a> = <span class="cons_Lit">"is"</span>

<span class="keyword">lexical restrictions</span>
  <span class="cons_Lit">"all"</span>
  <span class="cons_Lit">"case"</span>          <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"constructors"</span>
  <span class="cons_Lit">"else"</span>          <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"end"</span>           <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"external"</span>      <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"fail"</span>
  <span class="cons_Lit">"id"</span>
  <span class="cons_Lit">"if"</span>            <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"in"</span>
  <span class="cons_Lit">"is"</span>
  <span class="cons_Lit">"imports"</span>       <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"let"</span>
  <span class="cons_Lit">"module"</span>
  <span class="cons_Lit">"not"</span>
  <span class="cons_Lit">"one"</span>
  <span class="cons_Lit">"overlays"</span>
  <span class="cons_Lit">"otherwise"</span>     <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"prim"</span>
  <span class="cons_Lit">"proceed"</span>
  <span class="cons_Lit">"rec"</span>           <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"rules"</span>
  <span class="cons_Lit">"script"</span>
  <span class="cons_Lit">"signature"</span>
  <span class="cons_Lit">"some"</span>
  <span class="cons_Lit">"sorts"</span>
  <span class="cons_Lit">"strategies"</span>
  <span class="cons_Lit">"stratego"</span>
  <span class="cons_Lit">"switch"</span>        <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"test"</span>
  <span class="cons_Lit">"then"</span>          <span class="layout">// not reserved kw</span>
  <span class="cons_Lit">"where"</span>
  <span class="cons_Lit">"with"</span>
  <span class="cons_Lit">"import-term"</span>
    -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

</code></pre></td></tr></tbody></table></div>