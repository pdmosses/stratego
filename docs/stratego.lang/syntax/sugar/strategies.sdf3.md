---
title: strategies.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/strategies_1_8" title="Multi-file references" data-urls="../dynamic-rules.sdf3/#sugar/strategies_8_3 line 8; ../main.sdf3/#sugar/strategies_11_3 line 11; ../rules.sdf3/#sugar/strategies_9_5 line 9; ../terms.sdf3/#sugar/strategies_6_3 line 6">sugar/strategies</button>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_3_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/constants.sdf3/#core/constants_1_8" id="core/constants_4_3" title="Defined at ../../core/constants.sdf3 line 1">core/constants</a>
  <a href="../../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_5_3" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_6_3" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../terms.sdf3/#sugar/terms_1_8" id="sugar/terms_7_3" title="Defined at ../terms.sdf3 line 1">sugar/terms</a>
  <a href="../rules.sdf3/#sugar/rules_1_8" id="sugar/rules_8_3" title="Defined at ../rules.sdf3 line 1">sugar/rules</a>
  <a href="../constants.sdf3/#sugar/constants_1_8" id="sugar/constants_9_3" title="Defined at ../constants.sdf3 line 1">sugar/constants</a>
  <a href="../signatures.sdf3/#sugar/signatures_1_8" id="sugar/signatures_10_3" title="Defined at ../signatures.sdf3 line 1">sugar/signatures</a>

<span class="keyword">template options</span>
  <span class="keyword">tokenize</span>: ")(|"

<span class="keyword">context-free sorts</span> <a href="#SDefP_26_17" id="SDefP_15_20" title="Referenced at line 26">SDefP</a>
<span class="keyword">context-free syntax</span>
  <span id="StrategyDef_17_3" title="Not referenced">StrategyDef</span>.<span class="cons_Constructor"><span id="SDefNoArgs_17_15" title="Not referenced">SDefNoArgs</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_18_3" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt; <span class="cons_String">=</span>
  &lt;<a href="#Strategy_38_3" id="Strategy_19_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;

  <span id="StrategyDef_21_3" title="Not referenced">StrategyDef</span>.<span class="cons_Constructor"><span id="SDef_21_15" title="Not referenced">SDef</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_22_3" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_33_3" id="Typedid_22_10" title="Defined at line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_38_3" id="Strategy_23_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;

  <span class="layout">// Strategy definition with pattern matched term parameters</span>
  <span id="StrategyDef_26_3" title="Not referenced">StrategyDef</span> = <a href="#SDefP_15_20" id="SDefP_26_17" title="Defined at line 15, 27, 30">SDefP</a>
  <a href="#SDefP_26_17" id="SDefP_27_3" title="Referenced at line 26">SDefP</a>.<span class="cons_Constructor"><span id="SDefP_27_9" title="Not referenced">SDefP</span></span> =
&lt;&lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_28_3" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Typedid_33_3" id="Typedid_28_10" title="Defined at line 33">Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../terms.sdf3/#Term_13_3" id="Term_28_28" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#Strategy_38_3" id="Strategy_29_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;
  <a href="#SDefP_26_17" id="SDefP_30_3" title="Referenced at line 26">SDefP</a> = <a href="../../core/strategies.sdf3/#SDefT_17_32" id="SDefT_30_11" title="Defined at ../../core/strategies.sdf3 line 17, 21">SDefT</a> {<span class="keyword">reject</span>}

<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Typedid_33_3" title="Multi-file references" data-urls="#Typedid_22_10 line 22, 28; ../rules.sdf3/#Typedid_24_10 line 24, 29, 35">Typedid</button>.<span class="cons_Constructor"><span id="DefaultVarDec_33_11" title="Not referenced">DefaultVarDec</span></span> = <a href="../terms.sdf3/#ID_9_3" id="ID_33_27" title="Defined at ../terms.sdf3 line 9">ID</a>

<span class="keyword">context-free sorts</span> <a href="#Call_38_14" id="Call_35_20" title="Referenced at line 38">Call</a> <a href="#With_40_10" id="With_35_25" title="Referenced at line 40, 48">With</a>
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Strategy_38_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button> = <a href="#Call_35_20" id="Call_38_14" title="Defined at line 35, 39, 40">Call</a>
  <a href="#Call_38_14" id="Call_39_3" title="Referenced at line 38">Call</a>.<span class="cons_Constructor"><span id="Call_39_8" title="Not referenced">Call</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3/#SVar_53_29" id="SVar_39_17" title="Defined at ../../core/strategies.sdf3 line 53, 69">SVar</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Strategy_38_3" id="Strategy_39_25" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#Call_38_14" id="Call_40_3" title="Referenced at line 38">Call</a> = <a href="#With_35_25" id="With_40_10" title="Defined at line 35, 49">With</a> {<span class="keyword">reject</span>}
  <button class="modal-open" id="Strategy_41_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="ScopeDefault_41_12" title="Not referenced">ScopeDefault</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#Strategy_38_3" id="Strategy_41_30" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">}</span>&gt;
  <button class="modal-open" id="Strategy_42_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><button class="modal-open" id="BA_42_12" title="Multi-file references" data-urls="#BA_106_12 line 106, 124, 127; ../dynamic-rules.sdf3/#BA_99_15 line 99">BA</button></span> = [<span class="cons_String">&lt;</span>[<a href="#Strategy_38_3" id="Strategy_42_20" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="../terms.sdf3/#Term_13_3" id="Term_42_32" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>]]
  <button class="modal-open" id="Strategy_43_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><a href="#LChoice_112_13" id="LChoice_43_12" title="Referenced at line 112">LChoice</a></span> = [[<a href="#Strategy_38_3" id="Strategy_43_24" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">&lt;+</span> [<a href="#Strategy_38_3" id="Strategy_43_38" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]] {<span class="keyword">right</span>}

  <button class="modal-open" id="Strategy_45_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="Rec_45_12" title="Not referenced">Rec</span></span>        = &lt;<span class="cons_String">rec</span> &lt;<a href="../../core/strategies.sdf3/#SId_34_15" id="SId_45_31" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>&gt;<span class="cons_String">(</span> &lt;<a href="#Strategy_38_3" id="Strategy_45_38" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_46_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="Not_46_12" title="Not referenced">Not</span></span>        = &lt;<span class="cons_String">not(</span>&lt;<a href="#Strategy_38_3" id="Strategy_46_31" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_47_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="Where_47_12" title="Not referenced">Where</span></span>      = &lt;<span class="cons_String">where(</span>&lt;<a href="#Strategy_38_3" id="Strategy_47_33" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_48_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button> = <a href="#With_35_25" id="With_48_14" title="Defined at line 35, 49">With</a>
  <a href="#With_40_10" id="With_49_3" title="Referenced at line 40, 48">With</a>.<span class="cons_Constructor"><span id="With_49_8" title="Not referenced">With</span></span>       = &lt;<span class="cons_String">with(</span>&lt;<a href="#Strategy_38_3" id="Strategy_49_28" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_50_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="Test_50_12" title="Not referenced">Test</span></span>       = &lt;<span class="cons_String">test(</span>&lt;<a href="#Strategy_38_3" id="Strategy_50_32" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Use `where` instead")}
  <button class="modal-open" id="Strategy_51_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="PrimNoArgs_51_12" title="Not referenced">PrimNoArgs</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../../core/constants.sdf3/#String_3_24" id="String_51_32" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_52_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="Prim_52_12" title="Not referenced">Prim</span></span>       = &lt;<span class="cons_String">prim(</span>&lt;<a href="../../core/constants.sdf3/#String_3_24" id="String_52_32" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">,</span> &lt;{<a href="../terms.sdf3/#Term_13_3" id="Term_52_43" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;

<span class="keyword">context-free syntax</span> <span class="layout">// congruence operators</span>

  <button class="modal-open" id="Strategy_56_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="StrCong_56_12" title="Not referenced">StrCong</span></span>        = &lt;&lt;<a href="../../core/constants.sdf3/#String_3_24" id="String_56_31" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;&gt;
  <button class="modal-open" id="Strategy_57_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="IntCong_57_12" title="Not referenced">IntCong</span></span>        = &lt;&lt;<a href="../../core/constants.sdf3/#Int_3_15" id="Int_57_31" title="Defined at ../../core/constants.sdf3 line 3, 5">Int</a>&gt;&gt;
  <button class="modal-open" id="Strategy_58_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="RealCong_58_12" title="Not referenced">RealCong</span></span>       = &lt;&lt;<a href="../../core/constants.sdf3/#Real_3_19" id="Real_58_31" title="Defined at ../../core/constants.sdf3 line 3, 7">Real</a>&gt;&gt;
  <button class="modal-open" id="Strategy_59_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="CharCong_59_12" title="Not referenced">CharCong</span></span>       = &lt;&lt;<a href="../constants.sdf3/#Char_8_15" id="Char_59_31" title="Defined at ../constants.sdf3 line 8, 10">Char</a>&gt;&gt;
  <button class="modal-open" id="Strategy_60_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="CongQ_60_12" title="Not referenced">CongQ</span></span>          = &lt;&lt;<a href="../../core/constants.sdf3/#String_3_24" id="String_60_31" title="Defined at ../../core/constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Strategy_38_3" id="Strategy_60_41" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_61_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="EmptyTupleCong_61_12" title="Not referenced">EmptyTupleCong</span></span> = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_62_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>                = &lt;<span class="cons_String">(</span>&lt;<a href="#Strategy_38_3" id="Strategy_62_32" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <button class="modal-open" id="Strategy_63_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="TupleCong_63_12" title="Not referenced">TupleCong</span></span>      = &lt;<span class="cons_String">(</span>&lt;<a href="#Strategy_38_3" id="Strategy_63_32" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#Strategy_38_3" id="Strategy_63_45" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_64_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="ListCongNoTail_64_12" title="Not referenced">ListCongNoTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#Strategy_38_3" id="Strategy_64_33" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">]</span>&gt;
  <button class="modal-open" id="Strategy_65_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="ListCong_65_12" title="Not referenced">ListCong</span></span>       = &lt;<span class="cons_String">[</span>&lt;{<a href="#Strategy_38_3" id="Strategy_65_33" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#Strategy_38_3" id="Strategy_65_53" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">]</span>&gt;
  <button class="modal-open" id="Strategy_66_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><a href="#ExplodeCong_104_32" id="ExplodeCong_66_12" title="Referenced at line 104, 126">ExplodeCong</a></span>    = &lt;&lt;<a href="#Strategy_38_3" id="Strategy_66_31" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">#(</span>&lt;<a href="#Strategy_38_3" id="Strategy_66_43" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_67_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><button class="modal-open" id="AM_67_12" title="Multi-file references" data-urls="#AM_107_12 line 107, 124, 127; ../dynamic-rules.sdf3/#AM_101_15 line 101">AM</button></span>             = [[<a href="#Strategy_38_3" id="Strategy_67_31" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">=&gt;</span> [<a href="../terms.sdf3/#Term_13_3" id="Term_67_45" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>]]
  <button class="modal-open" id="Strategy_68_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><a href="#Assign_124_47" id="Assign_68_12" title="Referenced at line 124, 127">Assign</a></span>         = &lt;&lt;<a href="../terms.sdf3/#Term_13_3" id="Term_68_31" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>&gt; <span class="cons_String">:=</span> &lt;<a href="../terms.sdf3/#Term_13_3" id="Term_68_41" title="Defined at ../terms.sdf3 line 13, 14, 15, 16, 17, 32">Term</a>&gt;&gt;

  <button class="modal-open" id="Strategy_70_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><a href="#AnnoCong_104_14" id="AnnoCong_70_12" title="Referenced at line 104, 123">AnnoCong</a></span>       = &lt;&lt;<a href="#Strategy_38_3" id="Strategy_70_31" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">{</span>&lt;<a href="#Strategy_38_3" id="Strategy_70_42" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">}</span>&gt;

<span class="layout">// Syntactic sugar sugar</span>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Strategy_76_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="CallNoArgs_76_12" title="Not referenced">CallNoArgs</span></span> = &lt;&lt;<a href="../../core/strategies.sdf3/#SVar_53_29" id="SVar_76_27" title="Defined at ../../core/strategies.sdf3 line 53, 69">SVar</a>&gt;&gt;
  <button class="modal-open" id="Strategy_77_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="LRule_77_12" title="Not referenced">LRule</span></span>      = &lt;\\&lt;<a href="../rules.sdf3/#Rule_39_20" id="Rule_77_29" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;\\&gt;
  <button class="modal-open" id="Strategy_78_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="SRule_78_12" title="Not referenced">SRule</span></span>      = &lt;<span class="cons_String">(</span>&lt;<a href="../rules.sdf3/#Rule_39_20" id="Rule_78_28" title="Defined at ../rules.sdf3 line 39, 42">Rule</a>&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_79_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><a href="#Choice_111_13" id="Choice_79_12" title="Referenced at line 111, 137">Choice</a></span>     = &lt;&lt;<a href="#Strategy_38_3" id="Strategy_79_27" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">+</span> &lt;<a href="#Strategy_38_3" id="Strategy_79_40" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <button class="modal-open" id="Strategy_80_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><a href="#RChoice_113_13" id="RChoice_80_12" title="Referenced at line 113">RChoice</a></span>    = [[<a href="#Strategy_38_3" id="Strategy_80_27" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">+&gt;</span> [<a href="#Strategy_38_3" id="Strategy_80_41" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]] {<span class="keyword">right</span>, <span class="keyword">deprecated</span>("Flip your arguments and use &lt;+")}
  <button class="modal-open" id="Strategy_81_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="Proceed_81_12" title="Not referenced">Proceed</span></span>    = &lt;<span class="cons_String">proceed(</span>&lt;{<a href="#Strategy_38_3" id="Strategy_81_36" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt;
  <button class="modal-open" id="Strategy_82_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="CondChoice_82_12" title="Not referenced">CondChoice</span></span> = &lt;<span class="cons_String">if</span> &lt;<a href="#Strategy_38_3" id="Strategy_82_30" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">then</span> &lt;<a href="#Strategy_38_3" id="Strategy_82_46" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">else</span> &lt;<a href="#Strategy_38_3" id="Strategy_82_62" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">end</span>&gt;
  <button class="modal-open" id="Strategy_83_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="IfThen_83_12" title="Not referenced">IfThen</span></span>     = &lt;<span class="cons_String">if</span> &lt;<a href="#Strategy_38_3" id="Strategy_83_30" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">then</span> &lt;<a href="#Strategy_38_3" id="Strategy_83_46" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt; <span class="cons_String">end</span>&gt;
  <button class="modal-open" id="Strategy_84_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><a href="#LTrySome_109_12" id="LTrySome_84_12" title="Referenced at line 109">LTrySome</a></span>   = [[<a href="#Strategy_38_3" id="Strategy_84_27" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>] <span class="cons_String">&lt;*</span> [<a href="#Strategy_38_3" id="Strategy_84_41" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]] {<span class="keyword">left</span>}

<span class="keyword">context-free sorts</span> <a href="#SwitchCase_90_5" id="SwitchCase_86_20" title="Referenced at line 90, 95">SwitchCase</a>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="Strategy_88_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="SwitchChoiceNoOtherwise_88_12" title="Not referenced">SwitchChoiceNoOtherwise</span></span> =
&lt;<span class="cons_String">switch</span> &lt;<a href="#Strategy_38_3" id="Strategy_89_10" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;
  &lt;{<a href="#SwitchCase_86_20" id="SwitchCase_90_5" title="Defined at line 86, 99">SwitchCase</a> <span class="cons_Lit">"\n"</span>}*&gt;
<span class="cons_String">end</span>&gt;

  <button class="modal-open" id="Strategy_93_3" title="Multi-file references" data-urls="#Strategy_19_4 line 19, 23, 29, 39, 41, 42, 43, 45, 46, 47, 49, 50, 60, 62, 63, 64, 65, 66, 67, 70, 79, 80, 81, 82, 83, 84, 89, 94, 96, 100, 101, 104, 105, 106, 107, 108, 109, 111, 112, 113, 114, 123, 124, 126, 127, 136, 137; ../rules.sdf3/#Strategy_47_4 line 47, 50; ../terms.sdf3/#Strategy_16_26 line 16, 17, 22, 23">Strategy</button>.<span class="cons_Constructor"><span id="SwitchChoice_93_12" title="Not referenced">SwitchChoice</span></span> =
&lt;<span class="cons_String">switch</span> &lt;<a href="#Strategy_38_3" id="Strategy_94_10" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;
  &lt;{<a href="#SwitchCase_86_20" id="SwitchCase_95_5" title="Defined at line 86, 99">SwitchCase</a> <span class="cons_Lit">"\n"</span>}*&gt;
  <span class="cons_String">otherwise</span> <span class="cons_String">:</span> &lt;<a href="#Strategy_38_3" id="Strategy_96_16" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;
<span class="cons_String">end</span>&gt;

  <a href="#SwitchCase_90_5" id="SwitchCase_99_3" title="Referenced at line 90, 95">SwitchCase</a>.<span class="cons_Constructor"><span id="SwitchCase_99_14" title="Not referenced">SwitchCase</span></span> =
&lt;<span class="cons_String">case</span> &lt;<a href="#Strategy_38_3" id="Strategy_100_8" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;<span class="cons_String">:</span>
  &lt;<a href="#Strategy_38_3" id="Strategy_101_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>&gt;&gt;

<span class="keyword">context-free priorities</span>
  { <a href="#Strategy_38_3" id="Strategy_104_5" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_70_12" id="AnnoCong_104_14" title="Defined at line 70">AnnoCong</a></span> <a href="#Strategy_38_3" id="Strategy_104_23" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_66_12" id="ExplodeCong_104_32" title="Defined at line 66">ExplodeCong</a></span> }
&gt; { <a href="#Strategy_38_3" id="Strategy_105_5" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Match_59_12" id="Match_105_14" title="Defined at ../../core/strategies.sdf3 line 59">Match</a></span> <a href="#Strategy_38_3" id="Strategy_105_20" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Build_60_12" id="Build_105_29" title="Defined at ../../core/strategies.sdf3 line 60">Build</a></span> }
&gt; <a href="#Strategy_38_3" id="Strategy_106_3" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#BA_42_12" id="BA_106_12" title="Defined at line 42">BA</a></span>
&gt; <a href="#Strategy_38_3" id="Strategy_107_3" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AM_67_12" id="AM_107_12" title="Defined at line 67">AM</a></span>
&gt; <a href="#Strategy_38_3" id="Strategy_108_3" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Seq_62_12" id="Seq_108_12" title="Defined at ../../core/strategies.sdf3 line 62">Seq</a></span>
&gt; <a href="#Strategy_38_3" id="Strategy_109_3" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#LTrySome_84_12" id="LTrySome_109_12" title="Defined at line 84">LTrySome</a></span>
&gt; {<span class="keyword">right</span>:
   <a href="#Strategy_38_3" id="Strategy_111_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Choice_79_12" id="Choice_111_13" title="Defined at line 79">Choice</a></span>
   <a href="#Strategy_38_3" id="Strategy_112_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#LChoice_43_12" id="LChoice_112_13" title="Defined at line 43">LChoice</a></span>
   <a href="#Strategy_38_3" id="Strategy_113_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#RChoice_80_12" id="RChoice_113_13" title="Defined at line 80">RChoice</a></span>
   <a href="#Strategy_38_3" id="Strategy_114_4" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#GuardedLChoice_63_12" id="GuardedLChoice_114_13" title="Defined at ../../core/strategies.sdf3 line 63">GuardedLChoice</a></span>
  }

<span class="layout">// Strategy.AnnoCong and Strategy.ExplodeCong are same syntax as Term.AnnoList and Term.Explode</span>
<span class="layout">//   respectively. So we need to disambiguate that we prefer the Term version to be on the</span>
<span class="layout">//   right-hand side of Strategy productions that have a Term as the right-most part of their rule,</span>
<span class="layout">//   and this is expressed by that we don't want such a production inside AnnoCong or ExplodeCong as</span>
<span class="layout">//   the left-hand child.</span>
<span class="keyword">context-free priorities</span>
  <a href="#Strategy_38_3" id="Strategy_123_3" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_70_12" id="AnnoCong_123_12" title="Defined at line 70">AnnoCong</a></span> &lt;0&gt;
  .&gt; { <a href="#Strategy_38_3" id="Strategy_124_8" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Match_59_12" id="Match_124_17" title="Defined at ../../core/strategies.sdf3 line 59">Match</a></span> <a href="#Strategy_38_3" id="Strategy_124_23" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Build_60_12" id="Build_124_32" title="Defined at ../../core/strategies.sdf3 line 60">Build</a></span> <a href="#Strategy_38_3" id="Strategy_124_38" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Assign_68_12" id="Assign_124_47" title="Defined at line 68">Assign</a></span> <a href="#Strategy_38_3" id="Strategy_124_54" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#BA_42_12" id="BA_124_63" title="Defined at line 42">BA</a></span> <a href="#Strategy_38_3" id="Strategy_124_66" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AM_67_12" id="AM_124_75" title="Defined at line 67">AM</a></span> },

  <a href="#Strategy_38_3" id="Strategy_126_3" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_66_12" id="ExplodeCong_126_12" title="Defined at line 66">ExplodeCong</a></span> &lt;0&gt;
  .&gt; { <a href="#Strategy_38_3" id="Strategy_127_8" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Match_59_12" id="Match_127_17" title="Defined at ../../core/strategies.sdf3 line 59">Match</a></span> <a href="#Strategy_38_3" id="Strategy_127_23" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#Build_60_12" id="Build_127_32" title="Defined at ../../core/strategies.sdf3 line 60">Build</a></span> <a href="#Strategy_38_3" id="Strategy_127_38" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Assign_68_12" id="Assign_127_47" title="Defined at line 68">Assign</a></span> <a href="#Strategy_38_3" id="Strategy_127_54" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#BA_42_12" id="BA_127_63" title="Defined at line 42">BA</a></span> <a href="#Strategy_38_3" id="Strategy_127_66" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#AM_67_12" id="AM_127_75" title="Defined at line 67">AM</a></span> }

<span class="layout">// Normal priorities work on operator priority semantics using the outer recursive positions. </span>
<span class="layout">//   Strategy.GuardedLChoice and Strategy.Choice have a larger overlap, therefore we need to</span>
<span class="layout">//   disambiguate that we want `a &lt; b + (c + d)` not `a &lt; (b + c) + d` when there are no</span>
<span class="layout">//   parentheses. Therefore we disallow Strategy.Choice as the second argument to</span>
<span class="layout">//   Stratego.GuardedLChoice. This _should_ be under index &lt;1&gt;, but works as we want it under &lt;2&gt;,</span>
<span class="layout">//   which is probably a bug in SDF3 or JSGLR2?</span>
<span class="keyword">context-free priorities</span>
  <a href="#Strategy_38_3" id="Strategy_136_3" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies.sdf3/#GuardedLChoice_63_12" id="GuardedLChoice_136_12" title="Defined at ../../core/strategies.sdf3 line 63">GuardedLChoice</a></span> &lt;2&gt;
  .&gt; <a href="#Strategy_38_3" id="Strategy_137_6" title="Defined at line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>.<span class="cons_Constructor"><a href="#Choice_79_12" id="Choice_137_15" title="Defined at line 79">Choice</a></span>

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
