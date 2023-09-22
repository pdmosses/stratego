---
title: strategies.sdf3
---

# `strategies.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/strategies.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/strategies.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/strategies.sdf3 "The source file on GitHub"

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
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../terms.sdf3#sugar/strategies_79_95" id="sugar/strategies_7_23" title="Referenced at ../terms.sdf3 line 6">sugar/strategies</a>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_34_50" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/constants.sdf3#core/constants_7_21" id="core/constants_53_67" title="Defined at ../../core/constants.sdf3 line 1">core/constants</a>
  <a href="../../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_70_85" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_88_98" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../terms.sdf3#sugar/terms_7_18" id="sugar/terms_101_112" title="Defined at ../terms.sdf3 line 1">sugar/terms</a>
  <a href="../rules.sdf3#sugar/rules_7_18" id="sugar/rules_115_126" title="Defined at ../rules.sdf3 line 1">sugar/rules</a>
  <a href="../constants.sdf3#sugar/constants_7_22" id="sugar/constants_129_144" title="Defined at ../constants.sdf3 line 1">sugar/constants</a>
  <a href="../signatures.sdf3#sugar/signatures_7_23" id="sugar/signatures_147_163" title="Defined at ../signatures.sdf3 line 1">sugar/signatures</a>

<span class="keyword">template options</span>
  <span class="keyword">tokenize</span>: ")(|"

<span class="keyword">context-free sorts</span> <a href="#SDefP_439_444" id="SDefP_220_225" title="Referenced at line 26">SDefP</a>
<span class="keyword">context-free syntax</span>
  <span id="StrategyDef_248_259" title="Not referenced locally, nor via imports">StrategyDef</span>.<span class="cons_Constructor"><span id="SDefNoArgs_260_270" title="Not referenced locally, nor via imports">SDefNoArgs</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_275_278" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt; <span class="cons_String">=</span>
  &lt;<a href="#Strategy_645_653" id="Strategy_285_293" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;

  <span id="StrategyDef_299_310" title="Not referenced locally, nor via imports">StrategyDef</span>.<span class="cons_Constructor"><span id="SDef_311_315" title="Not referenced locally, nor via imports">SDef</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_320_323" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_565_572" id="Typedid_327_334" title="Defined at line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_645_653" id="Strategy_349_357" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;

  <span class="layout">// Strategy definition with pattern matched term parameters</span>
  <span id="StrategyDef_425_436" title="Not referenced locally, nor via imports">StrategyDef</span> = <a href="#SDefP_220_225" id="SDefP_439_444" title="Defined at line 15, 27, 30">SDefP</a>
  <a href="#SDefP_439_444" id="SDefP_447_452" title="Referenced at line 26">SDefP</a>.<span class="cons_Constructor"><span id="SDefP_453_458" title="Not referenced locally, nor via imports">SDefP</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_463_466" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_565_572" id="Typedid_470_477" title="Defined at line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3#Term_167_171" id="Term_488_492" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_645_653" id="Strategy_506_514" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;
  <a href="#SDefP_439_444" id="SDefP_519_524" title="Referenced at line 26">SDefP</a> = <a href="../../core/strategies.sdf3#SDefT_263_268" id="SDefT_527_532" title="Defined at ../../core/strategies.sdf3 line 17, 21">SDefT</a> {<span class="keyword">reject</span>}

<span class="keyword">context-free syntax</span>
  <a href="#Typedid_470_477" id="Typedid_565_572" title="Referenced at line 28">Typedid</a>.<span class="cons_Constructor"><span id="DefaultVarDec_573_586" title="Not referenced locally, nor via imports">DefaultVarDec</span></span> = <a href="../terms.sdf3#ID_119_121" id="ID_589_591" title="Defined at ../terms.sdf3 line 9">ID</a>

<span class="keyword">context-free sorts</span> <a href="#Call_656_660" id="Call_612_616" title="Referenced at line 38">Call</a> <a href="#With_1011_1015" id="With_617_621" title="Referenced at line 48">With</a>
<span class="keyword">context-free syntax</span>

  <a href="#Strategy_4302_4310" id="Strategy_645_653" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a> = <a href="#Call_612_616" id="Call_656_660" title="Defined at line 35, 39, 40">Call</a>
  <a href="#Call_656_660" id="Call_663_667" title="Referenced at line 38">Call</a>.<span class="cons_Constructor"><span id="Call_668_672" title="Not referenced locally, nor via imports">Call</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3#SVar_1049_1053" id="SVar_677_681" title="Defined at ../../core/strategies.sdf3 line 53, 69">SVar</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Strategy_645_653" id="Strategy_685_693" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#Call_656_660" id="Call_705_709" title="Referenced at line 38">Call</a> = <a href="#With_617_621" id="With_712_716" title="Defined at line 35, 49">With</a> {<span class="keyword">reject</span>}
  <a href="#Strategy_4302_4310" id="Strategy_728_736" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="ScopeDefault_737_749" title="Not referenced locally, nor via imports">ScopeDefault</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Strategy_645_653" id="Strategy_755_763" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">}</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_769_777" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#BA_3719_3721" id="BA_778_780" title="Referenced at line 127; ../dynamic-rules.sdf3 line 99">BA</a></span> = [<span class="cons_String">&lt;</span>[<a href="#Strategy_645_653" id="Strategy_786_794" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="../terms.sdf3#Term_167_171" id="Term_798_802" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>]]
  <a href="#Strategy_4302_4310" id="Strategy_807_815" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#LChoice_3027_3034" id="LChoice_816_823" title="Referenced at line 112">LChoice</a></span> = [[<a href="#Strategy_645_653" id="Strategy_828_836" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">&lt;+</span> [<a href="#Strategy_645_653" id="Strategy_842_850" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]] {<span class="keyword">right</span>}

  <a href="#Strategy_4302_4310" id="Strategy_864_872" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="Rec_873_876" title="Not referenced locally, nor via imports">Rec</span></span>        = &lt;<span class="cons_String">rec</span> &lt;<a href="../../core/strategies.sdf3#SId_686_689" id="SId_892_895" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span> &lt;<a href="#Strategy_645_653" id="Strategy_899_907" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_914_922" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="Not_923_926" title="Not referenced locally, nor via imports">Not</span></span>        = &lt;<span class="cons_String">not(</span>&lt;<a href="#Strategy_645_653" id="Strategy_942_950" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_956_964" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="Where_965_970" title="Not referenced locally, nor via imports">Where</span></span>      = &lt;<span class="cons_String">where(</span>&lt;<a href="#Strategy_645_653" id="Strategy_986_994" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1000_1008" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a> = <a href="#With_617_621" id="With_1011_1015" title="Defined at line 35, 49">With</a>
  <a href="#With_1011_1015" id="With_1018_1022" title="Referenced at line 48">With</a>.<span class="cons_Constructor"><span id="With_1023_1027" title="Not referenced locally, nor via imports">With</span></span>       = &lt;<span class="cons_String">with(</span>&lt;<a href="#Strategy_645_653" id="Strategy_1043_1051" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1057_1065" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="Test_1066_1070" title="Not referenced locally, nor via imports">Test</span></span>       = &lt;<span class="cons_String">test(</span>&lt;<a href="#Strategy_645_653" id="Strategy_1086_1094" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Use `where` instead")}
  <a href="#Strategy_4302_4310" id="Strategy_1136_1144" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="PrimNoArgs_1145_1155" title="Not referenced locally, nor via imports">PrimNoArgs</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../../core/constants.sdf3#String_46_52" id="String_1165_1171" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1177_1185" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="Prim_1186_1190" title="Not referenced locally, nor via imports">Prim</span></span>       = &lt;<span class="cons_String">prim(</span>&lt;<a href="../../core/constants.sdf3#String_46_52" id="String_1206_1212" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">,</span> &lt;{<a href="../terms.sdf3#Term_167_171" id="Term_1217_1221" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// congruence operators</span>

  <a href="#Strategy_4302_4310" id="Strategy_1280_1288" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="StrCong_1289_1296" title="Not referenced locally, nor via imports">StrCong</span></span>        = &lt;&lt;<a href="../../core/constants.sdf3#String_46_52" id="String_1308_1314" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1319_1327" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="IntCong_1328_1335" title="Not referenced locally, nor via imports">IntCong</span></span>        = &lt;&lt;<a href="../../core/constants.sdf3#Int_37_40" id="Int_1347_1350" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>&gt;&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1355_1363" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="RealCong_1364_1372" title="Not referenced locally, nor via imports">RealCong</span></span>       = &lt;&lt;<a href="../../core/constants.sdf3#Real_41_45" id="Real_1383_1387" title="Defined at ../../core/constants.sdf3 line 3, 7">Real</a>&gt;&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1392_1400" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="CharCong_1401_1409" title="Not referenced locally, nor via imports">CharCong</span></span>       = &lt;&lt;<a href="../constants.sdf3#Char_109_113" id="Char_1420_1424" title="Defined at ../constants.sdf3 line 8, 10">Char</a>&gt;&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1429_1437" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="CongQ_1438_1443" title="Not referenced locally, nor via imports">CongQ</span></span>          = &lt;&lt;<a href="../../core/constants.sdf3#String_46_52" id="String_1457_1463" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Strategy_645_653" id="Strategy_1467_1475" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1488_1496" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="EmptyTupleCong_1497_1511" title="Not referenced locally, nor via imports">EmptyTupleCong</span></span> = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1522_1530" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>                = &lt;<span class="cons_String">(</span>&lt;<a href="#Strategy_645_653" id="Strategy_1551_1559" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#Strategy_4302_4310" id="Strategy_1575_1583" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="TupleCong_1584_1593" title="Not referenced locally, nor via imports">TupleCong</span></span>      = &lt;<span class="cons_String">(</span>&lt;<a href="#Strategy_645_653" id="Strategy_1604_1612" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Strategy_645_653" id="Strategy_1617_1625" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1639_1647" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="ListCongNoTail_1648_1662" title="Not referenced locally, nor via imports">ListCongNoTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Strategy_645_653" id="Strategy_1669_1677" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">]</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1691_1699" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="ListCong_1700_1708" title="Not referenced locally, nor via imports">ListCong</span></span>       = &lt;<span class="cons_String">[</span>&lt;{<a href="#Strategy_645_653" id="Strategy_1721_1729" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Strategy_645_653" id="Strategy_1741_1749" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">]</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1756_1764" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_3641_3652" id="ExplodeCong_1765_1776" title="Referenced at line 126">ExplodeCong</a></span>    = &lt;&lt;<a href="#Strategy_645_653" id="Strategy_1784_1792" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">#(</span>&lt;<a href="#Strategy_645_653" id="Strategy_1796_1804" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_1810_1818" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#AM_3731_3733" id="AM_1819_1821" title="Referenced at line 127; ../dynamic-rules.sdf3 line 101">AM</a></span>             = [[<a href="#Strategy_645_653" id="Strategy_1838_1846" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">=&gt;</span> [<a href="../terms.sdf3#Term_167_171" id="Term_1852_1856" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>]]
  <a href="#Strategy_4302_4310" id="Strategy_1861_1869" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#Assign_3703_3709" id="Assign_1870_1876" title="Referenced at line 127">Assign</a></span>         = &lt;&lt;<a href="../terms.sdf3#Term_167_171" id="Term_1889_1893" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>&gt; <span class="cons_String">:=</span> &lt;<a href="../terms.sdf3#Term_167_171" id="Term_1899_1903" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>&gt;&gt;

  <a href="#Strategy_4302_4310" id="Strategy_1909_1917" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_3536_3544" id="AnnoCong_1918_1926" title="Referenced at line 123">AnnoCong</a></span>       = &lt;&lt;<a href="#Strategy_645_653" id="Strategy_1937_1945" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">{</span>&lt;<a href="#Strategy_645_653" id="Strategy_1948_1956" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">}</span>&gt;

<span class="layout">// Syntactic sugar sugar</span>

<span class="keyword">context-free syntax</span>

  <a href="#Strategy_4302_4310" id="Strategy_2010_2018" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="CallNoArgs_2019_2029" title="Not referenced locally, nor via imports">CallNoArgs</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3#SVar_1049_1053" id="SVar_2034_2038" title="Defined at ../../core/strategies.sdf3 line 53, 69">SVar</a>&gt;&gt;
  <a href="#Strategy_4302_4310" id="Strategy_2043_2051" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="LRule_2052_2057" title="Not referenced locally, nor via imports">LRule</span></span>      = &lt;\\&lt;<a href="../rules.sdf3#Rule_664_668" id="Rule_2069_2073" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;\\&gt;
  <a href="#Strategy_4302_4310" id="Strategy_2080_2088" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="SRule_2089_2094" title="Not referenced locally, nor via imports">SRule</span></span>      = &lt;<span class="cons_String">(</span>&lt;<a href="../rules.sdf3#Rule_664_668" id="Rule_2105_2109" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_2115_2123" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#Choice_4311_4317" id="Choice_2124_2130" title="Referenced at line 137">Choice</a></span>     = &lt;&lt;<a href="#Strategy_645_653" id="Strategy_2139_2147" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">+</span> &lt;<a href="#Strategy_645_653" id="Strategy_2152_2160" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#Strategy_4302_4310" id="Strategy_2173_2181" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#RChoice_3047_3054" id="RChoice_2182_2189" title="Referenced at line 113">RChoice</a></span>    = [[<a href="#Strategy_645_653" id="Strategy_2197_2205" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">+&gt;</span> [<a href="#Strategy_645_653" id="Strategy_2211_2219" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]] {<span class="keyword">right</span>, <span class="keyword">deprecated</span>("Flip your arguments and use &lt;+")}
  <a href="#Strategy_4302_4310" id="Strategy_2278_2286" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="Proceed_2287_2294" title="Not referenced locally, nor via imports">Proceed</span></span>    = &lt;<span class="cons_String">proceed(</span>&lt;{<a href="#Strategy_645_653" id="Strategy_2311_2319" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_2332_2340" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="CondChoice_2341_2351" title="Not referenced locally, nor via imports">CondChoice</span></span> = &lt;<span class="cons_String">if</span> &lt;<a href="#Strategy_645_653" id="Strategy_2359_2367" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">then</span> &lt;<a href="#Strategy_645_653" id="Strategy_2375_2383" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">else</span> &lt;<a href="#Strategy_645_653" id="Strategy_2391_2399" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">end</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_2408_2416" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="IfThen_2417_2423" title="Not referenced locally, nor via imports">IfThen</span></span>     = &lt;<span class="cons_String">if</span> &lt;<a href="#Strategy_645_653" id="Strategy_2435_2443" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">then</span> &lt;<a href="#Strategy_645_653" id="Strategy_2451_2459" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">end</span>&gt;
  <a href="#Strategy_4302_4310" id="Strategy_2468_2476" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><a href="#LTrySome_2977_2985" id="LTrySome_2477_2485" title="Referenced at line 109">LTrySome</a></span>   = [[<a href="#Strategy_645_653" id="Strategy_2492_2500" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">&lt;*</span> [<a href="#Strategy_645_653" id="Strategy_2506_2514" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]] {<span class="keyword">left</span>}

<span class="keyword">context-free sorts</span> <a href="#SwitchCase_2709_2719" id="SwitchCase_2544_2554" title="Referenced at line 95">SwitchCase</a>
<span class="keyword">context-free syntax</span>
  <a href="#Strategy_4302_4310" id="Strategy_2577_2585" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="SwitchChoiceNoOtherwise_2586_2609" title="Not referenced locally, nor via imports">SwitchChoiceNoOtherwise</span></span> =
&lt;<span class="cons_String">switch</span> &lt;<a href="#Strategy_645_653" id="Strategy_2621_2629" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;
  &lt;{<a href="#SwitchCase_2544_2554" id="SwitchCase_2635_2645" title="Defined at line 86, 99">SwitchCase</a> <span class="cons_Lit">"\n"</span>}*&gt;
<span class="cons_String">end</span>&gt;

  <a href="#Strategy_4302_4310" id="Strategy_2662_2670" title="Referenced at line 137; ../terms.sdf3 line 23">Strategy</a>.<span class="cons_Constructor"><span id="SwitchChoice_2671_2683" title="Not referenced locally, nor via imports">SwitchChoice</span></span> =
&lt;<span class="cons_String">switch</span> &lt;<a href="#Strategy_645_653" id="Strategy_2695_2703" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;
  &lt;{<a href="#SwitchCase_2544_2554" id="SwitchCase_2709_2719" title="Defined at line 86, 99">SwitchCase</a> <span class="cons_Lit">"\n"</span>}*&gt;
  <span class="cons_String">otherwise</span> <span class="cons_String">:</span> &lt;<a href="#Strategy_645_653" id="Strategy_2743_2751" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;
<span class="cons_String">end</span>&gt;

  <a href="#SwitchCase_2709_2719" id="SwitchCase_2761_2771" title="Referenced at line 95">SwitchCase</a>.<span class="cons_Constructor"><span id="SwitchCase_2772_2782" title="Not referenced locally, nor via imports">SwitchCase</span></span> =
&lt;<span class="cons_String">case</span> &lt;<a href="#Strategy_645_653" id="Strategy_2792_2800" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">:</span>
  &lt;<a href="#Strategy_645_653" id="Strategy_2806_2814" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;

<span class="keyword">context-free priorities</span>
  { <a href="#Strategy_645_653" id="Strategy_2846_2854" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_1918_1926" id="AnnoCong_2855_2863" title="Defined at line 70">AnnoCong</a></span> <a href="#Strategy_645_653" id="Strategy_2864_2872" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_1765_1776" id="ExplodeCong_2873_2884" title="Defined at line 66">ExplodeCong</a></span> }
&gt; { <a href="#Strategy_645_653" id="Strategy_2891_2899" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Match_1239_1244" id="Match_2900_2905" title="Defined at ../../core/strategies.sdf3 line 59">Match</a></span> <a href="#Strategy_645_653" id="Strategy_2906_2914" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Build_1268_1273" id="Build_2915_2920" title="Defined at ../../core/strategies.sdf3 line 60">Build</a></span> }
&gt; <a href="#Strategy_645_653" id="Strategy_2925_2933" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#BA_778_780" id="BA_2934_2936" title="Defined at line 42">BA</a></span>
&gt; <a href="#Strategy_645_653" id="Strategy_2939_2947" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AM_1819_1821" id="AM_2948_2950" title="Defined at line 67">AM</a></span>
&gt; <a href="#Strategy_645_653" id="Strategy_2953_2961" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Seq_1346_1349" id="Seq_2962_2965" title="Defined at ../../core/strategies.sdf3 line 62">Seq</a></span>
&gt; <a href="#Strategy_645_653" id="Strategy_2968_2976" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#LTrySome_2477_2485" id="LTrySome_2977_2985" title="Defined at line 84">LTrySome</a></span>
&gt; {<span class="keyword">right</span>:
   <a href="#Strategy_645_653" id="Strategy_2999_3007" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Choice_2124_2130" id="Choice_3008_3014" title="Defined at line 79">Choice</a></span>
   <a href="#Strategy_645_653" id="Strategy_3018_3026" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#LChoice_816_823" id="LChoice_3027_3034" title="Defined at line 43">LChoice</a></span>
   <a href="#Strategy_645_653" id="Strategy_3038_3046" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#RChoice_2182_2189" id="RChoice_3047_3054" title="Defined at line 80">RChoice</a></span>
   <a href="#Strategy_645_653" id="Strategy_3058_3066" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#GuardedLChoice_1398_1412" id="GuardedLChoice_3067_3081" title="Defined at ../../core/strategies.sdf3 line 63">GuardedLChoice</a></span>
  }

<span class="layout">// Strategy.AnnoCong and Strategy.ExplodeCong are same syntax as Term.AnnoList and Term.Explode</span>
<span class="layout">//   respectively. So we need to disambiguate that we prefer the Term version to be on the</span>
<span class="layout">//   right-hand side of Strategy productions that have a Term as the right-most part of their rule,</span>
<span class="layout">//   and this is expressed by that we don't want such a production inside AnnoCong or ExplodeCong as</span>
<span class="layout">//   the left-hand child.</span>
<span class="keyword">context-free priorities</span>
  <a href="#Strategy_645_653" id="Strategy_3527_3535" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_1918_1926" id="AnnoCong_3536_3544" title="Defined at line 70">AnnoCong</a></span> &lt;0&gt;
  .&gt; { <a href="#Strategy_645_653" id="Strategy_3556_3564" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Match_1239_1244" id="Match_3565_3570" title="Defined at ../../core/strategies.sdf3 line 59">Match</a></span> <a href="#Strategy_645_653" id="Strategy_3571_3579" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Build_1268_1273" id="Build_3580_3585" title="Defined at ../../core/strategies.sdf3 line 60">Build</a></span> <a href="#Strategy_645_653" id="Strategy_3586_3594" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Assign_1870_1876" id="Assign_3595_3601" title="Defined at line 68">Assign</a></span> <a href="#Strategy_645_653" id="Strategy_3602_3610" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#BA_778_780" id="BA_3611_3613" title="Defined at line 42">BA</a></span> <a href="#Strategy_645_653" id="Strategy_3614_3622" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AM_1819_1821" id="AM_3623_3625" title="Defined at line 67">AM</a></span> },

  <a href="#Strategy_645_653" id="Strategy_3632_3640" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_1765_1776" id="ExplodeCong_3641_3652" title="Defined at line 66">ExplodeCong</a></span> &lt;0&gt;
  .&gt; { <a href="#Strategy_645_653" id="Strategy_3664_3672" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Match_1239_1244" id="Match_3673_3678" title="Defined at ../../core/strategies.sdf3 line 59">Match</a></span> <a href="#Strategy_645_653" id="Strategy_3679_3687" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#Build_1268_1273" id="Build_3688_3693" title="Defined at ../../core/strategies.sdf3 line 60">Build</a></span> <a href="#Strategy_645_653" id="Strategy_3694_3702" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Assign_1870_1876" id="Assign_3703_3709" title="Defined at line 68">Assign</a></span> <a href="#Strategy_645_653" id="Strategy_3710_3718" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#BA_778_780" id="BA_3719_3721" title="Defined at line 42">BA</a></span> <a href="#Strategy_645_653" id="Strategy_3722_3730" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AM_1819_1821" id="AM_3731_3733" title="Defined at line 67">AM</a></span> }

<span class="layout">// Normal priorities work on operator priority semantics using the outer recursive positions. </span>
<span class="layout">//   Strategy.GuardedLChoice and Strategy.Choice have a larger overlap, therefore we need to</span>
<span class="layout">//   disambiguate that we want `a &lt; b + (c + d)` not `a &lt; (b + c) + d` when there are no</span>
<span class="layout">//   parentheses. Therefore we disallow Strategy.Choice as the second argument to</span>
<span class="layout">//   Stratego.GuardedLChoice. This _should_ be under index &lt;1&gt;, but works as we want it under &lt;2&gt;,</span>
<span class="layout">//   which is probably a bug in SDF3 or JSGLR2?</span>
<span class="keyword">context-free priorities</span>
  <a href="#Strategy_645_653" id="Strategy_4269_4277" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3#GuardedLChoice_1398_1412" id="GuardedLChoice_4278_4292" title="Defined at ../../core/strategies.sdf3 line 63">GuardedLChoice</a></span> &lt;2&gt;
  .&gt; <a href="#Strategy_645_653" id="Strategy_4302_4310" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Choice_2124_2130" id="Choice_4311_4317" title="Defined at line 79">Choice</a></span>

</code></pre></td></tr></tbody></table></div>