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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/identifiers_1_8" title="Multi-file references" data-urls="../main.sdf3/#core/identifiers_5_3 line 5; ../modules.sdf3/#core/identifiers_4_3 line 4; ../signatures.sdf3/#core/identifiers_4_3 line 4; ../strategies.sdf3/#core/identifiers_7_3 line 7; ../terms.sdf3/#core/identifiers_4_3 line 4; ../../deduplicated.sdf3/#core/identifiers_6_3 line 6; ../../gradual-types/internal.sdf3/#core/identifiers_4_3 line 4; ../../gradual-types/modules.sdf3/#core/identifiers_3_3 line 3; ../../gradual-types/overlays.sdf3/#core/identifiers_3_3 line 3; ../../gradual-types/signatures.sdf3/#core/identifiers_4_3 line 4; ../../gradual-types/strategies.sdf3/#core/identifiers_5_3 line 5; ../../sugar/constants.sdf3/#core/identifiers_4_3 line 4; ../../sugar/dynamic-rules.sdf3/#core/identifiers_4_3 line 4; ../../sugar/main.sdf3/#core/identifiers_4_3 line 4; ../../sugar/overlays.sdf3/#core/identifiers_3_3 line 3; ../../sugar/rules.sdf3/#core/identifiers_4_5 line 4; ../../sugar/signatures.sdf3/#core/identifiers_6_3 line 6; ../../sugar/strategies.sdf3/#core/identifiers_3_3 line 3; ../../sugar/terms.sdf3/#core/identifiers_4_3 line 4">core/identifiers</button>

<span class="keyword">lexical sorts</span> <button class="modal-open" id="ModName_3_15" title="Multi-file references" data-urls="#ModName_8_3 line 8; ../modules.sdf3/#ModName_13_10 line 13, 42, 45; ../strategies.sdf3/#ModName_84_39 line 84">ModName</button> <button class="modal-open" id="ModNamePart_3_23" title="Multi-file references" data-urls="#ModNamePart_5_14 line 5; ../../gradual-types/internal.sdf3/#ModNamePart_13_31 line 13">ModNamePart</button>
<span class="keyword">lexical syntax</span>
  <button class="modal-open" id="ModName_5_3" title="Multi-file references" data-urls="#ModName_8_3 line 8; ../modules.sdf3/#ModName_13_10 line 13, 42, 45; ../strategies.sdf3/#ModName_84_39 line 84">ModName</button> = {<a href="#ModNamePart_3_23" id="ModNamePart_5_14" title="Defined at line 3, 6">ModNamePart</a> <span class="cons_Lit">"/"</span>}+
  <button class="modal-open" id="ModNamePart_6_3" title="Multi-file references" data-urls="#ModNamePart_5_14 line 5; ../../gradual-types/internal.sdf3/#ModNamePart_13_31 line 13">ModNamePart</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>\.\_] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]*
<span class="keyword">lexical restrictions</span>
  <a href="#ModName_3_15" id="ModName_8_3" title="Defined at line 3, 5, 10, 11, 12, 13, 14">ModName</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\.\-\_]
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="ModName_10_3" title="Multi-file references" data-urls="#ModName_8_3 line 8; ../modules.sdf3/#ModName_13_10 line 13, 42, 45; ../strategies.sdf3/#ModName_84_39 line 84">ModName</button> = <span class="cons_Lit">"imports"</span>     {<span class="keyword">reject</span>}
  <button class="modal-open" id="ModName_11_3" title="Multi-file references" data-urls="#ModName_8_3 line 8; ../modules.sdf3/#ModName_13_10 line 13, 42, 45; ../strategies.sdf3/#ModName_84_39 line 84">ModName</button> = <span class="cons_Lit">"overlays"</span>    {<span class="keyword">reject</span>}
  <button class="modal-open" id="ModName_12_3" title="Multi-file references" data-urls="#ModName_8_3 line 8; ../modules.sdf3/#ModName_13_10 line 13, 42, 45; ../strategies.sdf3/#ModName_84_39 line 84">ModName</button> = <span class="cons_Lit">"rules"</span>       {<span class="keyword">reject</span>}
  <button class="modal-open" id="ModName_13_3" title="Multi-file references" data-urls="#ModName_8_3 line 8; ../modules.sdf3/#ModName_13_10 line 13, 42, 45; ../strategies.sdf3/#ModName_84_39 line 84">ModName</button> = <span class="cons_Lit">"signature"</span>   {<span class="keyword">reject</span>}
  <button class="modal-open" id="ModName_14_3" title="Multi-file references" data-urls="#ModName_8_3 line 8; ../modules.sdf3/#ModName_13_10 line 13, 42, 45; ../strategies.sdf3/#ModName_84_39 line 84">ModName</button> = <span class="cons_Lit">"strategies"</span>  {<span class="keyword">reject</span>}

<span class="keyword">lexical sorts</span> <button class="modal-open" id="Id_16_15" title="Multi-file references" data-urls="#Id_36_3 line 36, 37; ../signatures.sdf3/#Id_16_27 line 16, 35, 40, 44; ../strategies.sdf3/#Id_37_9 line 37; ../terms.sdf3/#Id_10_13 line 10, 30; ../../deduplicated.sdf3/#Id_29_20 line 29, 73; ../../gradual-types/internal.sdf3/#Id_41_27 line 41, 103; ../../gradual-types/overlays.sdf3/#Id_10_7 line 10, 13; ../../gradual-types/signatures.sdf3/#Id_19_25 line 19; ../../sugar/dynamic-rules.sdf3/#Id_52_7 line 52, 53; ../../sugar/overlays.sdf3/#Id_8_29 line 8, 11">Id</button> <button class="modal-open" id="LId_16_18" title="Multi-file references" data-urls="#LId_38_3 line 38; ../../sugar/terms.sdf3/#LId_9_23 line 9">LId</button> <button class="modal-open" id="LCID_16_22" title="Multi-file references" data-urls="#LCID_28_13 line 28, 39; ../signatures.sdf3/#LCID_13_27 line 13, 33; ../../deduplicated.sdf3/#LCID_26_24 line 26">LCID</button> <button class="modal-open" id="UCID_16_27" title="Multi-file references" data-urls="#UCID_40_3 line 40; ../signatures.sdf3/#UCID_14_27 line 14, 15, 18, 34; ../../deduplicated.sdf3/#UCID_27_24 line 27, 28, 31, 74; ../../gradual-types/signatures.sdf3/#UCID_20_23 line 20">UCID</button> <button class="modal-open" id="SortVar_16_32" title="Multi-file references" data-urls="../../deduplicated.sdf3/#SortVar_75_22 line 75; ../../gradual-types/signatures.sdf3/#SortVar_22_23 line 22">SortVar</button> <a href="#BuiltInType_29_13" id="BuiltInType_16_40" title="Referenced at line 29">BuiltInType</a> <span id="SomeSort_16_52" title="Not referenced">SomeSort</span>
<span class="keyword">lexical syntax</span>
<span class="layout">// Removed leading underscore option, nearly always conflicts with Term.BuildDefault</span>
<span class="layout">//  Id   = [a-zA-Z\_] [a-zA-Z0-9\'\-\_]*</span>
<span class="layout">//  LId  = [a-zA-Z\_] [a-zA-Z0-9\'\-\_]* "*"</span>
  <button class="modal-open" id="Id_21_3" title="Multi-file references" data-urls="#Id_36_3 line 36, 37; ../signatures.sdf3/#Id_16_27 line 16, 35, 40, 44; ../strategies.sdf3/#Id_37_9 line 37; ../terms.sdf3/#Id_10_13 line 10, 30; ../../deduplicated.sdf3/#Id_29_20 line 29, 73; ../../gradual-types/internal.sdf3/#Id_41_27 line 41, 103; ../../gradual-types/overlays.sdf3/#Id_10_7 line 10, 13; ../../gradual-types/signatures.sdf3/#Id_19_25 line 19; ../../sugar/dynamic-rules.sdf3/#Id_52_7 line 52, 53; ../../sugar/overlays.sdf3/#Id_8_29 line 8, 11">Id</button>   = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*
  <button class="modal-open" id="LId_22_3" title="Multi-file references" data-urls="#LId_38_3 line 38; ../../sugar/terms.sdf3/#LId_9_23 line 9">LId</button>  = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]* <span class="cons_Lit">"*"</span>
  <button class="modal-open" id="Id_23_3" title="Multi-file references" data-urls="#Id_36_3 line 36, 37; ../signatures.sdf3/#Id_16_27 line 16, 35, 40, 44; ../strategies.sdf3/#Id_37_9 line 37; ../terms.sdf3/#Id_10_13 line 10, 30; ../../deduplicated.sdf3/#Id_29_20 line 29, 73; ../../gradual-types/internal.sdf3/#Id_41_27 line 41, 103; ../../gradual-types/overlays.sdf3/#Id_10_7 line 10, 13; ../../gradual-types/signatures.sdf3/#Id_19_25 line 19; ../../sugar/dynamic-rules.sdf3/#Id_52_7 line 52, 53; ../../sugar/overlays.sdf3/#Id_8_29 line 8, 11">Id</button>   = [\'] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>]+

  <button class="modal-open" id="LCID_25_3" title="Multi-file references" data-urls="#LCID_28_13 line 28, 39; ../signatures.sdf3/#LCID_13_27 line 13, 33; ../../deduplicated.sdf3/#LCID_26_24 line 26">LCID</button> = [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*
  <button class="modal-open" id="UCID_26_3" title="Multi-file references" data-urls="#UCID_40_3 line 40; ../signatures.sdf3/#UCID_14_27 line 14, 15, 18, 34; ../../deduplicated.sdf3/#UCID_27_24 line 27, 28, 31, 74; ../../gradual-types/signatures.sdf3/#UCID_20_23 line 20">UCID</button> = [<span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span>] [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]*

  <button class="modal-open" id="SortVar_28_3" title="Multi-file references" data-urls="../../deduplicated.sdf3/#SortVar_75_22 line 75; ../../gradual-types/signatures.sdf3/#SortVar_22_23 line 22">SortVar</button> = <a href="#LCID_16_22" id="LCID_28_13" title="Defined at line 16, 25, 47">LCID</a>
  <button class="modal-open" id="SortVar_29_3" title="Multi-file references" data-urls="../../deduplicated.sdf3/#SortVar_75_22 line 75; ../../gradual-types/signatures.sdf3/#SortVar_22_23 line 22">SortVar</button> = <a href="#BuiltInType_16_40" id="BuiltInType_29_13" title="Defined at line 16, 30, 31, 32, 33">BuiltInType</a> {<span class="keyword">reject</span>}
  <a href="#BuiltInType_29_13" id="BuiltInType_30_3" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"string"</span>
  <a href="#BuiltInType_29_13" id="BuiltInType_31_3" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"int"</span>
  <a href="#BuiltInType_29_13" id="BuiltInType_32_3" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"real"</span>
  <a href="#BuiltInType_29_13" id="BuiltInType_33_3" title="Referenced at line 29">BuiltInType</a> = <span class="cons_Lit">"blob"</span>

<span class="keyword">lexical restrictions</span>
  <a href="#Id_16_15" id="Id_36_3" title="Defined at line 16, 21, 23, 43, 44, 45">Id</a>   -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\_\*]
  <a href="#Id_16_15" id="Id_37_3" title="Defined at line 16, 21, 23, 43, 44, 45">Id</a>   -/- [\-].~[\&gt;]
  <a href="#LId_16_18" id="LId_38_3" title="Defined at line 16, 22">LId</a>  -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#LCID_16_22" id="LCID_39_3" title="Defined at line 16, 25, 47">LCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <a href="#UCID_16_27" id="UCID_40_3" title="Defined at line 16, 26, 48">UCID</a> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]

<span class="keyword">lexical syntax</span>
  <button class="modal-open" id="Id_43_3" title="Multi-file references" data-urls="#Id_36_3 line 36, 37; ../signatures.sdf3/#Id_16_27 line 16, 35, 40, 44; ../strategies.sdf3/#Id_37_9 line 37; ../terms.sdf3/#Id_10_13 line 10, 30; ../../deduplicated.sdf3/#Id_29_20 line 29, 73; ../../gradual-types/internal.sdf3/#Id_41_27 line 41, 103; ../../gradual-types/overlays.sdf3/#Id_10_7 line 10, 13; ../../gradual-types/signatures.sdf3/#Id_19_25 line 19; ../../sugar/dynamic-rules.sdf3/#Id_52_7 line 52, 53; ../../sugar/overlays.sdf3/#Id_8_29 line 8, 11">Id</button>   = <span class="cons_Lit">"_"</span>      {<span class="keyword">reject</span>}
  <button class="modal-open" id="Id_44_3" title="Multi-file references" data-urls="#Id_36_3 line 36, 37; ../signatures.sdf3/#Id_16_27 line 16, 35, 40, 44; ../strategies.sdf3/#Id_37_9 line 37; ../terms.sdf3/#Id_10_13 line 10, 30; ../../deduplicated.sdf3/#Id_29_20 line 29, 73; ../../gradual-types/internal.sdf3/#Id_41_27 line 41, 103; ../../gradual-types/overlays.sdf3/#Id_10_7 line 10, 13; ../../gradual-types/signatures.sdf3/#Id_19_25 line 19; ../../sugar/dynamic-rules.sdf3/#Id_52_7 line 52, 53; ../../sugar/overlays.sdf3/#Id_8_29 line 8, 11">Id</button>   = <span class="cons_Lit">"'"</span>      {<span class="keyword">reject</span>}
  <button class="modal-open" id="Id_45_3" title="Multi-file references" data-urls="#Id_36_3 line 36, 37; ../signatures.sdf3/#Id_16_27 line 16, 35, 40, 44; ../strategies.sdf3/#Id_37_9 line 37; ../terms.sdf3/#Id_10_13 line 10, 30; ../../deduplicated.sdf3/#Id_29_20 line 29, 73; ../../gradual-types/internal.sdf3/#Id_41_27 line 41, 103; ../../gradual-types/overlays.sdf3/#Id_10_7 line 10, 13; ../../gradual-types/signatures.sdf3/#Id_19_25 line 19; ../../sugar/dynamic-rules.sdf3/#Id_52_7 line 52, 53; ../../sugar/overlays.sdf3/#Id_8_29 line 8, 11">Id</button>   = <a href="#Keyword_50_15" id="Keyword_45_10" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}
  <span id="Lid_46_3" title="Not referenced">Lid</span>  = <a href="#Keyword_50_15" id="Keyword_46_10" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}
  <button class="modal-open" id="LCID_47_3" title="Multi-file references" data-urls="#LCID_28_13 line 28, 39; ../signatures.sdf3/#LCID_13_27 line 13, 33; ../../deduplicated.sdf3/#LCID_26_24 line 26">LCID</button> = <a href="#Keyword_50_15" id="Keyword_47_10" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}
  <button class="modal-open" id="UCID_48_3" title="Multi-file references" data-urls="#UCID_40_3 line 40; ../signatures.sdf3/#UCID_14_27 line 14, 15, 18, 34; ../../deduplicated.sdf3/#UCID_27_24 line 27, 28, 31, 74; ../../gradual-types/signatures.sdf3/#UCID_20_23 line 20">UCID</button> = <a href="#Keyword_50_15" id="Keyword_48_10" title="Defined at line 50, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75">Keyword</a>  {<span class="keyword">reject</span>}

<span class="keyword">lexical sorts</span> <a href="#Keyword_45_10" id="Keyword_50_15" title="Referenced at line 45, 46, 47, 48">Keyword</a>
<span class="keyword">lexical syntax</span>
  <a href="#Keyword_45_10" id="Keyword_52_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"all"</span>
  <a href="#Keyword_45_10" id="Keyword_53_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"constructors"</span>
  <a href="#Keyword_45_10" id="Keyword_54_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"fail"</span>
  <a href="#Keyword_45_10" id="Keyword_55_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"id"</span>
  <a href="#Keyword_45_10" id="Keyword_56_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"in"</span>
  <a href="#Keyword_45_10" id="Keyword_57_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"let"</span>
  <a href="#Keyword_45_10" id="Keyword_58_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"module"</span>
  <a href="#Keyword_45_10" id="Keyword_59_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"not"</span>
  <a href="#Keyword_45_10" id="Keyword_60_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"one"</span>
  <a href="#Keyword_45_10" id="Keyword_61_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"overlays"</span>
  <a href="#Keyword_45_10" id="Keyword_62_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"prim"</span>
  <a href="#Keyword_45_10" id="Keyword_63_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"proceed"</span>
  <a href="#Keyword_45_10" id="Keyword_64_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"rules"</span>
  <a href="#Keyword_45_10" id="Keyword_65_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"script"</span>
  <a href="#Keyword_45_10" id="Keyword_66_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"signature"</span>
  <a href="#Keyword_45_10" id="Keyword_67_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"some"</span>
  <a href="#Keyword_45_10" id="Keyword_68_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"sorts"</span>
  <a href="#Keyword_45_10" id="Keyword_69_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"strategies"</span>
  <a href="#Keyword_45_10" id="Keyword_70_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"stratego"</span>
  <a href="#Keyword_45_10" id="Keyword_71_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"test"</span>
  <a href="#Keyword_45_10" id="Keyword_72_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"where"</span>
<span class="layout">//  Keyword = "with"</span>
  <a href="#Keyword_45_10" id="Keyword_74_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"import-term"</span>
  <a href="#Keyword_45_10" id="Keyword_75_3" title="Referenced at line 45, 46, 47, 48">Keyword</a> = <span class="cons_Lit">"is"</span>

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

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
