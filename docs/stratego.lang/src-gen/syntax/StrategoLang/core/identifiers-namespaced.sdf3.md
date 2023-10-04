---
title: identifiers-namespaced.sdf3
hide:
  - toc
---

# `identifiers-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/identifiers-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/identifiers-namespaced.sdf3 "The source file on GitHub"

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
113
114
115
116
117
118
119
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/terms-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_92_132" id="StrategoLang/core/identifiers-namespaced_7_47" title="Referenced at ../../sugar/terms-namespaced.sdf3 line 5">StrategoLang/core/identifiers-namespaced</a>


<span class="keyword">sorts</span> <span id="ModName_56_63" title="Not referenced locally, nor via imports">ModName</span><span class="keyword">-LEX</span> <span id="ModNamePart_68_79" title="Not referenced locally, nor via imports">ModNamePart</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-ModName_254_274" id="StrategoLang-ModName_103_123" title="Referenced at line 13; ../modules-namespaced.sdf3 line 42; ../strategies-namespaced.sdf3 line 79">StrategoLang-ModName</a> = {<a href="#StrategoLang-ModNamePart_164_188" id="StrategoLang-ModNamePart_127_151" title="Defined at line 9">StrategoLang-ModNamePart</a> <span class="cons_Lit">"/"</span>}+ { }
  <a href="#StrategoLang-ModNamePart_127_151" id="StrategoLang-ModNamePart_164_188" title="Referenced at line 8; ../../gradual-types/internal-namespaced.sdf3 line 14">StrategoLang-ModNamePart</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]* { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-ModName_103_123" id="StrategoLang-ModName_254_274" title="Defined at line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-ModName_254_274" id="StrategoLang-ModName_323_343" title="Referenced at line 13; ../modules-namespaced.sdf3 line 42; ../strategies-namespaced.sdf3 line 79">StrategoLang-ModName</a> = <span class="cons_Lit">"imports"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-ModName_254_274" id="StrategoLang-ModName_367_387" title="Referenced at line 13; ../modules-namespaced.sdf3 line 42; ../strategies-namespaced.sdf3 line 79">StrategoLang-ModName</a> = <span class="cons_Lit">"overlays"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-ModName_254_274" id="StrategoLang-ModName_412_432" title="Referenced at line 13; ../modules-namespaced.sdf3 line 42; ../strategies-namespaced.sdf3 line 79">StrategoLang-ModName</a> = <span class="cons_Lit">"rules"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-ModName_254_274" id="StrategoLang-ModName_454_474" title="Referenced at line 13; ../modules-namespaced.sdf3 line 42; ../strategies-namespaced.sdf3 line 79">StrategoLang-ModName</a> = <span class="cons_Lit">"signature"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-ModName_254_274" id="StrategoLang-ModName_500_520" title="Referenced at line 13; ../modules-namespaced.sdf3 line 42; ../strategies-namespaced.sdf3 line 79">StrategoLang-ModName</a> = <span class="cons_Lit">"strategies"</span> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <span id="Id_552_554" title="Not referenced locally, nor via imports">Id</span><span class="keyword">-LEX</span> <span id="LId_559_562" title="Not referenced locally, nor via imports">LId</span><span class="keyword">-LEX</span> <span id="LCID_567_571" title="Not referenced locally, nor via imports">LCID</span><span class="keyword">-LEX</span> <span id="UCID_576_580" title="Not referenced locally, nor via imports">UCID</span><span class="keyword">-LEX</span> <span id="SortVar_585_592" title="Not referenced locally, nor via imports">SortVar</span><span class="keyword">-LEX</span> <span id="BuiltInType_597_608" title="Not referenced locally, nor via imports">BuiltInType</span><span class="keyword">-LEX</span> <span id="SomeSort_613_621" title="Not referenced locally, nor via imports">SomeSort</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Id_1222_1237" id="StrategoLang-Id_645_660" title="Referenced at line 42; ../signatures-namespaced.sdf3 line 48; ../strategies-namespaced.sdf3 line 36; ../terms-namespaced.sdf3 line 33; ../../deduplicated-namespaced.sdf3 line 60; ../../gradual-types/internal-namespaced.sdf3 line 96; ../../gradual-types/overlays-namespaced.sdf3 line 12; ../../gradual-types/signatures-namespaced.sdf3 line 21; ../../sugar/dynamic-rules-namespaced.sdf3 line 42; ../../sugar/overlays-namespaced.sdf3 line 12">StrategoLang-Id</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* { }
  <a href="#StrategoLang-LId_1255_1271" id="StrategoLang-LId_697_713" title="Referenced at line 43; ../../sugar/terms-namespaced.sdf3 line 11">StrategoLang-LId</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span> { }
  <a href="#StrategoLang-Id_1222_1237" id="StrategoLang-Id_754_769" title="Referenced at line 42; ../signatures-namespaced.sdf3 line 48; ../strategies-namespaced.sdf3 line 36; ../terms-namespaced.sdf3 line 33; ../../deduplicated-namespaced.sdf3 line 60; ../../gradual-types/internal-namespaced.sdf3 line 96; ../../gradual-types/overlays-namespaced.sdf3 line 12; ../../gradual-types/signatures-namespaced.sdf3 line 21; ../../sugar/dynamic-rules-namespaced.sdf3 line 42; ../../sugar/overlays-namespaced.sdf3 line 12">StrategoLang-Id</a> = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+ { }
  <a href="#StrategoLang-LCID_1296_1313" id="StrategoLang-LCID_790_807" title="Referenced at line 44; ../signatures-namespaced.sdf3 line 36; ../../deduplicated-namespaced.sdf3 line 21">StrategoLang-LCID</a> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* { }
  <a href="#StrategoLang-UCID_1338_1355" id="StrategoLang-UCID_841_858" title="Referenced at line 45; ../signatures-namespaced.sdf3 line 37; ../../deduplicated-namespaced.sdf3 line 61; ../../gradual-types/signatures-namespaced.sdf3 line 22">StrategoLang-UCID</a> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* { }
  <a href="../../deduplicated-namespaced.sdf3#StrategoLang-SortVar_3005_3025" id="StrategoLang-SortVar_892_912" title="Referenced at ../../deduplicated-namespaced.sdf3 line 62; ../../gradual-types/signatures-namespaced.sdf3 line 24">StrategoLang-SortVar</a> = <a href="#StrategoLang-LCID_790_807" id="StrategoLang-LCID_915_932" title="Defined at line 30, 53">StrategoLang-LCID</a> { }
  <a href="../../deduplicated-namespaced.sdf3#StrategoLang-SortVar_3005_3025" id="StrategoLang-SortVar_939_959" title="Referenced at ../../deduplicated-namespaced.sdf3 line 62; ../../gradual-types/signatures-namespaced.sdf3 line 24">StrategoLang-SortVar</a> = <a href="#StrategoLang-BuiltInType_998_1022" id="StrategoLang-BuiltInType_962_986" title="Defined at line 34, 35, 36, 37">StrategoLang-BuiltInType</a> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-BuiltInType_962_986" id="StrategoLang-BuiltInType_998_1022" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"string"</span> { }
  <a href="#StrategoLang-BuiltInType_962_986" id="StrategoLang-BuiltInType_1040_1064" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"int"</span> { }
  <a href="#StrategoLang-BuiltInType_962_986" id="StrategoLang-BuiltInType_1079_1103" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"real"</span> { }
  <a href="#StrategoLang-BuiltInType_962_986" id="StrategoLang-BuiltInType_1119_1143" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"blob"</span> { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-Id_645_660" id="StrategoLang-Id_1182_1197" title="Defined at line 27, 29, 49, 50, 51">StrategoLang-Id</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#StrategoLang-Id_645_660" id="StrategoLang-Id_1222_1237" title="Defined at line 27, 29, 49, 50, 51">StrategoLang-Id</a> -/- [\-].~[\&gt;]
  <a href="#StrategoLang-LId_697_713" id="StrategoLang-LId_1255_1271" title="Defined at line 28">StrategoLang-LId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#StrategoLang-LCID_790_807" id="StrategoLang-LCID_1296_1313" title="Defined at line 30, 53">StrategoLang-LCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#StrategoLang-UCID_841_858" id="StrategoLang-UCID_1338_1355" title="Defined at line 31, 54">StrategoLang-UCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Id_1222_1237" id="StrategoLang-Id_1397_1412" title="Referenced at line 42; ../signatures-namespaced.sdf3 line 48; ../strategies-namespaced.sdf3 line 36; ../terms-namespaced.sdf3 line 33; ../../deduplicated-namespaced.sdf3 line 60; ../../gradual-types/internal-namespaced.sdf3 line 96; ../../gradual-types/overlays-namespaced.sdf3 line 12; ../../gradual-types/signatures-namespaced.sdf3 line 21; ../../sugar/dynamic-rules-namespaced.sdf3 line 42; ../../sugar/overlays-namespaced.sdf3 line 12">StrategoLang-Id</a> = <span class="cons_Lit">"_"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-Id_1222_1237" id="StrategoLang-Id_1430_1445" title="Referenced at line 42; ../signatures-namespaced.sdf3 line 48; ../strategies-namespaced.sdf3 line 36; ../terms-namespaced.sdf3 line 33; ../../deduplicated-namespaced.sdf3 line 60; ../../gradual-types/internal-namespaced.sdf3 line 96; ../../gradual-types/overlays-namespaced.sdf3 line 12; ../../gradual-types/signatures-namespaced.sdf3 line 21; ../../sugar/dynamic-rules-namespaced.sdf3 line 42; ../../sugar/overlays-namespaced.sdf3 line 12">StrategoLang-Id</a> = <span class="cons_Lit">"'"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-Id_1222_1237" id="StrategoLang-Id_1463_1478" title="Referenced at line 42; ../signatures-namespaced.sdf3 line 48; ../strategies-namespaced.sdf3 line 36; ../terms-namespaced.sdf3 line 33; ../../deduplicated-namespaced.sdf3 line 60; ../../gradual-types/internal-namespaced.sdf3 line 96; ../../gradual-types/overlays-namespaced.sdf3 line 12; ../../gradual-types/signatures-namespaced.sdf3 line 21; ../../sugar/dynamic-rules-namespaced.sdf3 line 42; ../../sugar/overlays-namespaced.sdf3 line 12">StrategoLang-Id</a> = <a href="#StrategoLang-Keyword_1704_1724" id="StrategoLang-Keyword_1481_1501" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}
  <span id="StrategoLang-Lid_1513_1529" title="Not referenced locally, nor via imports">StrategoLang-Lid</span> = <a href="#StrategoLang-Keyword_1704_1724" id="StrategoLang-Keyword_1532_1552" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-LCID_1296_1313" id="StrategoLang-LCID_1564_1581" title="Referenced at line 44; ../signatures-namespaced.sdf3 line 36; ../../deduplicated-namespaced.sdf3 line 21">StrategoLang-LCID</a> = <a href="#StrategoLang-Keyword_1704_1724" id="StrategoLang-Keyword_1584_1604" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-UCID_1338_1355" id="StrategoLang-UCID_1616_1633" title="Referenced at line 45; ../signatures-namespaced.sdf3 line 37; ../../deduplicated-namespaced.sdf3 line 61; ../../gradual-types/signatures-namespaced.sdf3 line 22">StrategoLang-UCID</a> = <a href="#StrategoLang-Keyword_1704_1724" id="StrategoLang-Keyword_1636_1656" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <span id="Keyword_1673_1680" title="Not referenced locally, nor via imports">Keyword</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1704_1724" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"all"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1739_1759" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"constructors"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1783_1803" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"fail"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1819_1839" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"id"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1853_1873" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"in"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1887_1907" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"let"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1922_1942" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"module"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1960_1980" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"not"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_1995_2015" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"one"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2030_2050" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"overlays"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2070_2090" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"prim"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2106_2126" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"proceed"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2145_2165" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"rules"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2182_2202" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"script"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2220_2240" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"signature"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2261_2281" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"some"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2297_2317" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"sorts"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2334_2354" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"strategies"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2376_2396" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"stratego"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2416_2436" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"test"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2452_2472" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"where"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2489_2509" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"import-term"</span> { }
  <a href="#StrategoLang-Keyword_1636_1656" id="StrategoLang-Keyword_2532_2552" title="Referenced at line 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"is"</span> { }

<span class="keyword">lexical restrictions</span>

  <span class="cons_Lit">"all"</span>
  <span class="cons_Lit">"case"</span>
  <span class="cons_Lit">"constructors"</span>
  <span class="cons_Lit">"else"</span>
  <span class="cons_Lit">"end"</span>
  <span class="cons_Lit">"external"</span>
  <span class="cons_Lit">"fail"</span>
  <span class="cons_Lit">"id"</span>
  <span class="cons_Lit">"if"</span>
  <span class="cons_Lit">"in"</span>
  <span class="cons_Lit">"is"</span>
  <span class="cons_Lit">"imports"</span>
  <span class="cons_Lit">"let"</span>
  <span class="cons_Lit">"module"</span>
  <span class="cons_Lit">"not"</span>
  <span class="cons_Lit">"one"</span>
  <span class="cons_Lit">"overlays"</span>
  <span class="cons_Lit">"otherwise"</span>
  <span class="cons_Lit">"prim"</span>
  <span class="cons_Lit">"proceed"</span>
  <span class="cons_Lit">"rec"</span>
  <span class="cons_Lit">"rules"</span>
  <span class="cons_Lit">"script"</span>
  <span class="cons_Lit">"signature"</span>
  <span class="cons_Lit">"some"</span>
  <span class="cons_Lit">"sorts"</span>
  <span class="cons_Lit">"strategies"</span>
  <span class="cons_Lit">"stratego"</span>
  <span class="cons_Lit">"switch"</span>
  <span class="cons_Lit">"test"</span>
  <span class="cons_Lit">"then"</span>
  <span class="cons_Lit">"where"</span>
  <span class="cons_Lit">"with"</span>
  <span class="cons_Lit">"import-term"</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

</code></pre></td></tr></tbody></table></div>