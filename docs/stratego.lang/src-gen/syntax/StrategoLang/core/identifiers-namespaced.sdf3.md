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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/core/identifiers-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_5_3 line 5; ../modules-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../signatures-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../strategies-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_7_3 line 7; ../terms-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../deduplicated-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_6_3 line 6; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../gradual-types/modules-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../gradual-types/strategies-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_5_3 line 5; ../../sugar/constants-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../sugar/main-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../sugar/overlays-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../sugar/rules-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../sugar/signatures-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_6_3 line 6; ../../sugar/strategies-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_4_3 line 4; ../../sugar/terms-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_5_3 line 5">StrategoLang/core/identifiers-namespaced</button>


<span class="keyword">sorts</span> <span id="ModName_4_7" title="Not referenced">ModName</span><span class="keyword">-LEX</span> <span id="ModNamePart_4_19" title="Not referenced">ModNamePart</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="StrategoLang-ModName_8_3" title="Multi-file references" data-urls="#StrategoLang-ModName_13_3 line 13; ../modules-namespaced.sdf3/#StrategoLang-ModName_13_41 line 13, 38, 42; ../strategies-namespaced.sdf3/#StrategoLang-ModName_79_52 line 79">StrategoLang-ModName</button> = {<a href="#StrategoLang-ModNamePart_9_3" id="StrategoLang-ModNamePart_8_27" title="Defined at line 9">StrategoLang-ModNamePart</a> <span class="cons_Lit">"/"</span>}+ { }
  <button class="modal-open" id="StrategoLang-ModNamePart_9_3" title="Multi-file references" data-urls="#StrategoLang-ModNamePart_8_27 line 8; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-ModNamePart_14_44 line 14">StrategoLang-ModNamePart</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]* { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-ModName_8_3" id="StrategoLang-ModName_13_3" title="Defined at line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-ModName_17_3" title="Multi-file references" data-urls="#StrategoLang-ModName_13_3 line 13; ../modules-namespaced.sdf3/#StrategoLang-ModName_13_41 line 13, 38, 42; ../strategies-namespaced.sdf3/#StrategoLang-ModName_79_52 line 79">StrategoLang-ModName</button> = <span class="cons_Lit">"imports"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-ModName_18_3" title="Multi-file references" data-urls="#StrategoLang-ModName_13_3 line 13; ../modules-namespaced.sdf3/#StrategoLang-ModName_13_41 line 13, 38, 42; ../strategies-namespaced.sdf3/#StrategoLang-ModName_79_52 line 79">StrategoLang-ModName</button> = <span class="cons_Lit">"overlays"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-ModName_19_3" title="Multi-file references" data-urls="#StrategoLang-ModName_13_3 line 13; ../modules-namespaced.sdf3/#StrategoLang-ModName_13_41 line 13, 38, 42; ../strategies-namespaced.sdf3/#StrategoLang-ModName_79_52 line 79">StrategoLang-ModName</button> = <span class="cons_Lit">"rules"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-ModName_20_3" title="Multi-file references" data-urls="#StrategoLang-ModName_13_3 line 13; ../modules-namespaced.sdf3/#StrategoLang-ModName_13_41 line 13, 38, 42; ../strategies-namespaced.sdf3/#StrategoLang-ModName_79_52 line 79">StrategoLang-ModName</button> = <span class="cons_Lit">"signature"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-ModName_21_3" title="Multi-file references" data-urls="#StrategoLang-ModName_13_3 line 13; ../modules-namespaced.sdf3/#StrategoLang-ModName_13_41 line 13, 38, 42; ../strategies-namespaced.sdf3/#StrategoLang-ModName_79_52 line 79">StrategoLang-ModName</button> = <span class="cons_Lit">"strategies"</span> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <span id="Id_23_7" title="Not referenced">Id</span><span class="keyword">-LEX</span> <span id="LId_23_14" title="Not referenced">LId</span><span class="keyword">-LEX</span> <span id="LCID_23_22" title="Not referenced">LCID</span><span class="keyword">-LEX</span> <span id="UCID_23_31" title="Not referenced">UCID</span><span class="keyword">-LEX</span> <span id="SortVar_23_40" title="Not referenced">SortVar</span><span class="keyword">-LEX</span> <span id="BuiltInType_23_52" title="Not referenced">BuiltInType</span><span class="keyword">-LEX</span> <span id="SomeSort_23_68" title="Not referenced">SomeSort</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="StrategoLang-Id_27_3" title="Multi-file references" data-urls="#StrategoLang-Id_41_3 line 41, 42; ../signatures-namespaced.sdf3/#StrategoLang-Id_20_40 line 20, 38, 45, 48; ../strategies-namespaced.sdf3/#StrategoLang-Id_36_22 line 36; ../terms-namespaced.sdf3/#StrategoLang-Id_12_21 line 12, 33; ../../deduplicated-namespaced.sdf3/#StrategoLang-Id_24_33 line 24, 60; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Id_41_40 line 41, 96; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang-Id_11_46 line 11, 12; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Id_21_32 line 21; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Id_41_57 line 41, 42; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Id_11_42 line 11, 12">StrategoLang-Id</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* { }
  <button class="modal-open" id="StrategoLang-LId_28_3" title="Multi-file references" data-urls="#StrategoLang-LId_43_3 line 43; ../../sugar/terms-namespaced.sdf3/#StrategoLang-LId_11_29 line 11">StrategoLang-LId</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span> { }
  <button class="modal-open" id="StrategoLang-Id_29_3" title="Multi-file references" data-urls="#StrategoLang-Id_41_3 line 41, 42; ../signatures-namespaced.sdf3/#StrategoLang-Id_20_40 line 20, 38, 45, 48; ../strategies-namespaced.sdf3/#StrategoLang-Id_36_22 line 36; ../terms-namespaced.sdf3/#StrategoLang-Id_12_21 line 12, 33; ../../deduplicated-namespaced.sdf3/#StrategoLang-Id_24_33 line 24, 60; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Id_41_40 line 41, 96; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang-Id_11_46 line 11, 12; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Id_21_32 line 21; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Id_41_57 line 41, 42; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Id_11_42 line 11, 12">StrategoLang-Id</button> = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+ { }
  <button class="modal-open" id="StrategoLang-LCID_30_3" title="Multi-file references" data-urls="#StrategoLang-LCID_32_26 line 32, 44; ../signatures-namespaced.sdf3/#StrategoLang-LCID_17_37 line 17, 36; ../../deduplicated-namespaced.sdf3/#StrategoLang-LCID_21_34 line 21">StrategoLang-LCID</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* { }
  <button class="modal-open" id="StrategoLang-UCID_31_3" title="Multi-file references" data-urls="#StrategoLang-UCID_45_3 line 45; ../signatures-namespaced.sdf3/#StrategoLang-UCID_18_40 line 18, 19, 21, 37; ../../deduplicated-namespaced.sdf3/#StrategoLang-UCID_22_37 line 22, 23, 25, 61; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-UCID_22_36 line 22">StrategoLang-UCID</button> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* { }
  <button class="modal-open" id="StrategoLang-SortVar_32_3" title="Multi-file references" data-urls="../../deduplicated-namespaced.sdf3/#StrategoLang-SortVar_62_32 line 62; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-SortVar_24_33 line 24">StrategoLang-SortVar</button> = <a href="#StrategoLang-LCID_30_3" id="StrategoLang-LCID_32_26" title="Defined at line 30, 53">StrategoLang-LCID</a> { }
  <button class="modal-open" id="StrategoLang-SortVar_33_3" title="Multi-file references" data-urls="../../deduplicated-namespaced.sdf3/#StrategoLang-SortVar_62_32 line 62; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-SortVar_24_33 line 24">StrategoLang-SortVar</button> = <a href="#StrategoLang-BuiltInType_34_3" id="StrategoLang-BuiltInType_33_26" title="Defined at line 34, 35, 36, 37">StrategoLang-BuiltInType</a> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-BuiltInType_33_26" id="StrategoLang-BuiltInType_34_3" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"string"</span> { }
  <a href="#StrategoLang-BuiltInType_33_26" id="StrategoLang-BuiltInType_35_3" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"int"</span> { }
  <a href="#StrategoLang-BuiltInType_33_26" id="StrategoLang-BuiltInType_36_3" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"real"</span> { }
  <a href="#StrategoLang-BuiltInType_33_26" id="StrategoLang-BuiltInType_37_3" title="Referenced at line 33">StrategoLang-BuiltInType</a> = <span class="cons_Lit">"blob"</span> { }

<span class="keyword">lexical restrictions</span>

  <a href="#StrategoLang-Id_27_3" id="StrategoLang-Id_41_3" title="Defined at line 27, 29, 49, 50, 51">StrategoLang-Id</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#StrategoLang-Id_27_3" id="StrategoLang-Id_42_3" title="Defined at line 27, 29, 49, 50, 51">StrategoLang-Id</a> -/- [\-].~[\&gt;]
  <a href="#StrategoLang-LId_28_3" id="StrategoLang-LId_43_3" title="Defined at line 28">StrategoLang-LId</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#StrategoLang-LCID_30_3" id="StrategoLang-LCID_44_3" title="Defined at line 30, 53">StrategoLang-LCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#StrategoLang-UCID_31_3" id="StrategoLang-UCID_45_3" title="Defined at line 31, 54">StrategoLang-UCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

<span class="keyword">lexical syntax</span>

  <button class="modal-open" id="StrategoLang-Id_49_3" title="Multi-file references" data-urls="#StrategoLang-Id_41_3 line 41, 42; ../signatures-namespaced.sdf3/#StrategoLang-Id_20_40 line 20, 38, 45, 48; ../strategies-namespaced.sdf3/#StrategoLang-Id_36_22 line 36; ../terms-namespaced.sdf3/#StrategoLang-Id_12_21 line 12, 33; ../../deduplicated-namespaced.sdf3/#StrategoLang-Id_24_33 line 24, 60; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Id_41_40 line 41, 96; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang-Id_11_46 line 11, 12; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Id_21_32 line 21; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Id_41_57 line 41, 42; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Id_11_42 line 11, 12">StrategoLang-Id</button> = <span class="cons_Lit">"_"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-Id_50_3" title="Multi-file references" data-urls="#StrategoLang-Id_41_3 line 41, 42; ../signatures-namespaced.sdf3/#StrategoLang-Id_20_40 line 20, 38, 45, 48; ../strategies-namespaced.sdf3/#StrategoLang-Id_36_22 line 36; ../terms-namespaced.sdf3/#StrategoLang-Id_12_21 line 12, 33; ../../deduplicated-namespaced.sdf3/#StrategoLang-Id_24_33 line 24, 60; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Id_41_40 line 41, 96; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang-Id_11_46 line 11, 12; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Id_21_32 line 21; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Id_41_57 line 41, 42; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Id_11_42 line 11, 12">StrategoLang-Id</button> = <span class="cons_Lit">"'"</span> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-Id_51_3" title="Multi-file references" data-urls="#StrategoLang-Id_41_3 line 41, 42; ../signatures-namespaced.sdf3/#StrategoLang-Id_20_40 line 20, 38, 45, 48; ../strategies-namespaced.sdf3/#StrategoLang-Id_36_22 line 36; ../terms-namespaced.sdf3/#StrategoLang-Id_12_21 line 12, 33; ../../deduplicated-namespaced.sdf3/#StrategoLang-Id_24_33 line 24, 60; ../../gradual-types/internal-namespaced.sdf3/#StrategoLang-Id_41_40 line 41, 96; ../../gradual-types/overlays-namespaced.sdf3/#StrategoLang-Id_11_46 line 11, 12; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-Id_21_32 line 21; ../../sugar/dynamic-rules-namespaced.sdf3/#StrategoLang-Id_41_57 line 41, 42; ../../sugar/overlays-namespaced.sdf3/#StrategoLang-Id_11_42 line 11, 12">StrategoLang-Id</button> = <a href="#StrategoLang-Keyword_60_3" id="StrategoLang-Keyword_51_21" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}
  <span id="StrategoLang-Lid_52_3" title="Not referenced">StrategoLang-Lid</span> = <a href="#StrategoLang-Keyword_60_3" id="StrategoLang-Keyword_52_22" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-LCID_53_3" title="Multi-file references" data-urls="#StrategoLang-LCID_32_26 line 32, 44; ../signatures-namespaced.sdf3/#StrategoLang-LCID_17_37 line 17, 36; ../../deduplicated-namespaced.sdf3/#StrategoLang-LCID_21_34 line 21">StrategoLang-LCID</button> = <a href="#StrategoLang-Keyword_60_3" id="StrategoLang-Keyword_53_23" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="StrategoLang-UCID_54_3" title="Multi-file references" data-urls="#StrategoLang-UCID_45_3 line 45; ../signatures-namespaced.sdf3/#StrategoLang-UCID_18_40 line 18, 19, 21, 37; ../../deduplicated-namespaced.sdf3/#StrategoLang-UCID_22_37 line 22, 23, 25, 61; ../../gradual-types/signatures-namespaced.sdf3/#StrategoLang-UCID_22_36 line 22">StrategoLang-UCID</button> = <a href="#StrategoLang-Keyword_60_3" id="StrategoLang-Keyword_54_23" title="Defined at line 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82">StrategoLang-Keyword</a> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <span id="Keyword_56_7" title="Not referenced">Keyword</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_60_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"all"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_61_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"constructors"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_62_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"fail"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_63_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"id"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_64_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"in"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_65_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"let"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_66_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"module"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_67_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"not"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_68_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"one"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_69_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"overlays"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_70_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"prim"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_71_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"proceed"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_72_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"rules"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_73_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"script"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_74_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"signature"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_75_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"some"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_76_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"sorts"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_77_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"strategies"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_78_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"stratego"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_79_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"test"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_80_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"where"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_81_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"import-term"</span> { }
  <a href="#StrategoLang-Keyword_51_21" id="StrategoLang-Keyword_82_3" title="Referenced at line 51, 52, 53, 54">StrategoLang-Keyword</a> = <span class="cons_Lit">"is"</span> { }

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

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
