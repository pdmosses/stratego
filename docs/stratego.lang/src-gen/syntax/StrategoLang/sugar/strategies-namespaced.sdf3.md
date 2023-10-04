---
title: strategies-namespaced.sdf3
hide:
  - toc
---

# `strategies-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/strategies-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/strategies-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../terms-namespaced.sdf3#StrategoLang/sugar/strategies-namespaced_179_219" id="StrategoLang/sugar/strategies-namespaced_7_47" title="Referenced at ../terms-namespaced.sdf3 line 7">StrategoLang/sugar/strategies-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_59_99" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/constants-namespaced.sdf3#StrategoLang/core/constants-namespaced_7_45" id="StrategoLang/core/constants-namespaced_103_141" title="Defined at ../../core/constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_145_184" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_188_222" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../terms-namespaced.sdf3#StrategoLang/sugar/terms-namespaced_7_42" id="StrategoLang/sugar/terms-namespaced_226_261" title="Defined at ../terms-namespaced.sdf3 line 1">StrategoLang/sugar/terms-namespaced</a>        
  <a href="../rules-namespaced.sdf3#StrategoLang/sugar/rules-namespaced_7_42" id="StrategoLang/sugar/rules-namespaced_265_300" title="Defined at ../rules-namespaced.sdf3 line 1">StrategoLang/sugar/rules-namespaced</a>        
  <a href="../constants-namespaced.sdf3#StrategoLang/sugar/constants-namespaced_7_46" id="StrategoLang/sugar/constants-namespaced_304_343" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/sugar/constants-namespaced</a>        
  <a href="../signatures-namespaced.sdf3#StrategoLang/sugar/signatures-namespaced_7_47" id="StrategoLang/sugar/signatures-namespaced_347_387" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/sugar/signatures-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">tokenize</span> : ")(|"

<span class="keyword">sorts</span> <a href="#StrategoLang-SDefP_715_733" id="StrategoLang-SDefP_433_451" title="Referenced at line 25">StrategoLang-SDefP</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-StrategyDef_476_500" title="Not referenced locally, nor via imports">StrategoLang-StrategyDef</span>.<span class="cons_Constructor"><span id="SDefNoArgs_501_511" title="Not referenced locally, nor via imports">SDefNoArgs</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_516_532" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt; <span class="cons_String">=</span>
  &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_539_560" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;&gt; { }
  <span id="StrategoLang-StrategyDef_569_593" title="Not referenced locally, nor via imports">StrategoLang-StrategyDef</span>.<span class="cons_Constructor"><span id="SDef_594_598" title="Not referenced locally, nor via imports">SDef</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_603_619" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_954_974" id="StrategoLang-Typedid_623_643" title="Defined at line 32">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_658_679" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;&gt; { }
  <span id="StrategoLang-StrategyDef_688_712" title="Not referenced locally, nor via imports">StrategoLang-StrategyDef</span> = <a href="#StrategoLang-SDefP_433_451" id="StrategoLang-SDefP_715_733" title="Defined at line 17, 26, 28">StrategoLang-SDefP</a> { }
  <a href="#StrategoLang-SDefP_715_733" id="StrategoLang-SDefP_740_758" title="Referenced at line 25">StrategoLang-SDefP</a>.<span class="cons_Constructor"><span id="SDefP_759_764" title="Not referenced locally, nor via imports">SDefP</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_769_785" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Typedid_954_974" id="StrategoLang-Typedid_789_809" title="Defined at line 32">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">|</span>&lt;{<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_820_837" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">","</span>}+&gt;<span class="cons_String">)</span> <span class="cons_String">=</span>
  &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_851_872" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;&gt; { }
  <a href="#StrategoLang-SDefP_715_733" id="StrategoLang-SDefP_881_899" title="Referenced at line 25">StrategoLang-SDefP</a> = <a href="../../core/strategies-namespaced.sdf3#StrategoLang-SDefT_420_438" id="StrategoLang-SDefT_902_920" title="Defined at ../../core/strategies-namespaced.sdf3 line 20, 25">StrategoLang-SDefT</a> {<span class="keyword">reject</span>}

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Typedid_789_809" id="StrategoLang-Typedid_954_974" title="Referenced at line 26">StrategoLang-Typedid</a>.<span class="cons_Constructor"><span id="DefaultVarDec_975_988" title="Not referenced locally, nor via imports">DefaultVarDec</span></span> = <a href="../../core/terms-namespaced.sdf3#StrategoLang-ID_143_158" id="StrategoLang-ID_991_1006" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 12">StrategoLang-ID</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Call_1102_1119" id="StrategoLang-Call_1018_1035" title="Referenced at line 38">StrategoLang-Call</a> <a href="#StrategoLang-With_1751_1768" id="StrategoLang-With_1036_1053" title="Referenced at line 47">StrategoLang-With</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1078_1099" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a> = <a href="#StrategoLang-Call_1018_1035" id="StrategoLang-Call_1102_1119" title="Defined at line 34, 39, 40">StrategoLang-Call</a> { }
  <a href="#StrategoLang-Call_1102_1119" id="StrategoLang-Call_1126_1143" title="Referenced at line 38">StrategoLang-Call</a>.<span class="cons_Constructor"><span id="Call_1144_1148" title="Not referenced locally, nor via imports">Call</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SVar_1575_1592" id="StrategoLang-SVar_1153_1170" title="Defined at ../../core/strategies-namespaced.sdf3 line 54, 71">StrategoLang-SVar</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1174_1195" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a> <span class="cons_Lit">","</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Call_1102_1119" id="StrategoLang-Call_1211_1228" title="Referenced at line 38">StrategoLang-Call</a> = <a href="#StrategoLang-With_1036_1053" id="StrategoLang-With_1231_1248" title="Defined at line 34, 48">StrategoLang-With</a> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1260_1281" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="ScopeDefault_1282_1294" title="Not referenced locally, nor via imports">ScopeDefault</span></span> = &lt;<span class="cons_String">{</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1300_1321" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">}</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1331_1352" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#BA_5609_5611" id="BA_1353_1355" title="Referenced at line 116">BA</a></span> = [<span class="cons_String">&lt;</span>[<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1361_1382" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]<span class="cons_String">&gt;</span> [<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1386_1403" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1412_1433" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#LChoice_4874_4881" id="LChoice_1434_1441" title="Referenced at line 102">LChoice</a></span> = [[<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1446_1467" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>] <span class="cons_String">&lt;+</span> [<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1473_1494" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]] {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1507_1528" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Rec_1529_1532" title="Not referenced locally, nor via imports">Rec</span></span> = &lt;<span class="cons_String">rec</span> &lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_1541_1557" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1561_1582" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1593_1614" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Not_1615_1618" title="Not referenced locally, nor via imports">Not</span></span> = &lt;<span class="cons_String">not(</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1627_1648" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1658_1679" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Where_1680_1685" title="Not referenced locally, nor via imports">Where</span></span> = &lt;<span class="cons_String">where(</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1696_1717" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1727_1748" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a> = <a href="#StrategoLang-With_1036_1053" id="StrategoLang-With_1751_1768" title="Defined at line 34, 48">StrategoLang-With</a> { }
  <a href="#StrategoLang-With_1751_1768" id="StrategoLang-With_1775_1792" title="Referenced at line 47">StrategoLang-With</a>.<span class="cons_Constructor"><span id="With_1793_1797" title="Not referenced locally, nor via imports">With</span></span> = &lt;<span class="cons_String">with(</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1807_1828" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1838_1859" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Test_1860_1864" title="Not referenced locally, nor via imports">Test</span></span> = &lt;<span class="cons_String">test(</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_1874_1895" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("Use `where` instead")}
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_1937_1958" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="PrimNoArgs_1959_1969" title="Not referenced locally, nor via imports">PrimNoArgs</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../../core/constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_1979_1998" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2008_2029" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Prim_2030_2034" title="Not referenced locally, nor via imports">Prim</span></span> = &lt;<span class="cons_String">prim(</span>&lt;<a href="../../core/constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_2044_2063" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;<span class="cons_String">,</span> &lt;{<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_2068_2085" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2124_2145" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="StrCong_2146_2153" title="Not referenced locally, nor via imports">StrCong</span></span> = &lt;&lt;<a href="../../core/constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_2158_2177" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2186_2207" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="IntCong_2208_2215" title="Not referenced locally, nor via imports">IntCong</span></span> = &lt;&lt;<a href="../../core/constants-namespaced.sdf3#StrategoLang-Int_113_129" id="StrategoLang-Int_2220_2236" title="Defined at ../../core/constants-namespaced.sdf3 line 8">StrategoLang-Int</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2245_2266" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="RealCong_2267_2275" title="Not referenced locally, nor via imports">RealCong</span></span> = &lt;&lt;<a href="../../core/constants-namespaced.sdf3#StrategoLang-Real_151_168" id="StrategoLang-Real_2280_2297" title="Defined at ../../core/constants-namespaced.sdf3 line 9">StrategoLang-Real</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2306_2327" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="CharCong_2328_2336" title="Not referenced locally, nor via imports">CharCong</span></span> = &lt;&lt;<a href="../constants-namespaced.sdf3#StrategoLang-Char_240_257" id="StrategoLang-Char_2341_2358" title="Defined at ../constants-namespaced.sdf3 line 12">StrategoLang-Char</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2367_2388" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="CongQ_2389_2394" title="Not referenced locally, nor via imports">CongQ</span></span> = &lt;&lt;<a href="../../core/constants-namespaced.sdf3#StrategoLang-String_202_221" id="StrategoLang-String_2399_2418" title="Defined at ../../core/constants-namespaced.sdf3 line 10">StrategoLang-String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2422_2443" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2460_2481" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="EmptyTupleCong_2482_2496" title="Not referenced locally, nor via imports">EmptyTupleCong</span></span> = &lt;<span class="cons_String">(</span> <span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2511_2532" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a> = &lt;<span class="cons_String">(</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2538_2559" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; {<span class="keyword">bracket</span>}
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2575_2596" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="TupleCong_2597_2606" title="Not referenced locally, nor via imports">TupleCong</span></span> = &lt;<span class="cons_String">(</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2612_2633" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">,</span> &lt;{<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2638_2659" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2677_2698" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="ListCongNoTail_2699_2713" title="Not referenced locally, nor via imports">ListCongNoTail</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2720_2741" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">]</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2759_2780" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="ListCong_2781_2789" title="Not referenced locally, nor via imports">ListCong</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2796_2817" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2829_2850" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">]</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2861_2882" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_5350_5361" id="ExplodeCong_2883_2894" title="Referenced at line 113">ExplodeCong</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2899_2920" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">#(</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2924_2945" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_2955_2976" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#AM_5678_5680" id="AM_2977_2979" title="Referenced at line 117">AM</a></span> = [[<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_2984_3005" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>] <span class="cons_String">=&gt;</span> [<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_3011_3028" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>]] { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3037_3058" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Assign_5536_5542" id="Assign_3059_3065" title="Referenced at line 115">Assign</a></span> = &lt;&lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_3070_3087" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt; <span class="cons_String">:=</span> &lt;<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_3093_3110" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3119_3140" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_5008_5016" id="AnnoCong_3141_3149" title="Referenced at line 108">AnnoCong</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3154_3175" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">{</span>&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3178_3199" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">}</span>&gt; { }

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3231_3252" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="CallNoArgs_3253_3263" title="Not referenced locally, nor via imports">CallNoArgs</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SVar_1575_1592" id="StrategoLang-SVar_3268_3285" title="Defined at ../../core/strategies-namespaced.sdf3 line 54, 71">StrategoLang-SVar</a>&gt;&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3294_3315" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="LRule_3316_3321" title="Not referenced locally, nor via imports">LRule</span></span> = &lt;\\&lt;<a href="../rules-namespaced.sdf3#StrategoLang-Rule_1140_1157" id="StrategoLang-Rule_3328_3345" title="Defined at ../rules-namespaced.sdf3 line 32, 36">StrategoLang-Rule</a>&gt;\\&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3356_3377" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="SRule_3378_3383" title="Not referenced locally, nor via imports">SRule</span></span> = &lt;<span class="cons_String">(</span>&lt;<a href="../rules-namespaced.sdf3#StrategoLang-Rule_1140_1157" id="StrategoLang-Rule_3389_3406" title="Defined at ../rules-namespaced.sdf3 line 32, 36">StrategoLang-Rule</a>&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3416_3437" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Choice_5776_5782" id="Choice_3438_3444" title="Referenced at line 121">Choice</a></span> = &lt;&lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3449_3470" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">+</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3475_3496" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;&gt; {<span class="keyword">right</span>}
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3509_3530" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#RChoice_4908_4915" id="RChoice_3531_3538" title="Referenced at line 103">RChoice</a></span> = [[<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3543_3564" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>] <span class="cons_String">+&gt;</span> [<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3570_3591" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]] {<span class="keyword">right</span>, <span class="keyword">deprecated</span>("Flip your arguments and use &lt;+")}
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3650_3671" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Proceed_3672_3679" title="Not referenced locally, nor via imports">Proceed</span></span> = &lt;<span class="cons_String">proceed(</span>&lt;{<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3693_3714" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">)</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3731_3752" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="CondChoice_3753_3763" title="Not referenced locally, nor via imports">CondChoice</span></span> = &lt;<span class="cons_String">if</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3771_3792" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">then</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3800_3821" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">else</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3829_3850" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">end</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3863_3884" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="IfThen_3885_3891" title="Not referenced locally, nor via imports">IfThen</span></span> = &lt;<span class="cons_String">if</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3899_3920" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">then</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3928_3949" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt; <span class="cons_String">end</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_3962_3983" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#LTrySome_4795_4803" id="LTrySome_3984_3992" title="Referenced at line 100">LTrySome</a></span> = [[<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_3997_4018" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>] <span class="cons_String">&lt;*</span> [<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4024_4045" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>]] {<span class="keyword">left</span>}

<span class="keyword">sorts</span> <a href="#StrategoLang-SwitchCase_4310_4333" id="StrategoLang-SwitchCase_4062_4085" title="Referenced at line 90">StrategoLang-SwitchCase</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_4110_4131" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="SwitchChoiceNoOtherwise_4132_4155" title="Not referenced locally, nor via imports">SwitchChoiceNoOtherwise</span></span> = &lt;<span class="cons_String">switch</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4167_4188" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;
  &lt;{<a href="#StrategoLang-SwitchCase_4062_4085" id="StrategoLang-SwitchCase_4194_4217" title="Defined at line 82, 93">StrategoLang-SwitchCase</a> <span class="cons_Lit">"\n"</span>}*&gt;
<span class="cons_String">end</span>&gt; { }
  <a href="#StrategoLang-Strategy_5754_5775" id="StrategoLang-Strategy_4237_4258" title="Referenced at line 121; ../terms-namespaced.sdf3 line 25">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="SwitchChoice_4259_4271" title="Not referenced locally, nor via imports">SwitchChoice</span></span> = &lt;<span class="cons_String">switch</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4283_4304" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;
  &lt;{<a href="#StrategoLang-SwitchCase_4062_4085" id="StrategoLang-SwitchCase_4310_4333" title="Defined at line 82, 93">StrategoLang-SwitchCase</a> <span class="cons_Lit">"\n"</span>}*&gt;
  <span class="cons_String">otherwise</span> <span class="cons_String">:</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4357_4378" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;
<span class="cons_String">end</span>&gt; { }
  <a href="#StrategoLang-SwitchCase_4310_4333" id="StrategoLang-SwitchCase_4391_4414" title="Referenced at line 90">StrategoLang-SwitchCase</a>.<span class="cons_Constructor"><span id="SwitchCase_4415_4425" title="Not referenced locally, nor via imports">SwitchCase</span></span> = &lt;<span class="cons_String">case</span> &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4435_4456" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;<span class="cons_String">:</span>
  &lt;<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4462_4483" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>&gt;&gt; { }

<span class="keyword">context-free priorities</span>

  {<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4519_4540" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_3141_3149" id="AnnoCong_4541_4549" title="Defined at line 68">AnnoCong</a></span>
   <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4553_4574" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_2883_2894" id="ExplodeCong_4575_4586" title="Defined at line 65">ExplodeCong</a></span>} &gt; {<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4591_4612" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Match_1883_1888" id="Match_4613_4618" title="Defined at ../../core/strategies-namespaced.sdf3 line 62">Match</a></span>
                                         <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4660_4681" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Build_1942_1947" id="Build_4682_4687" title="Defined at ../../core/strategies-namespaced.sdf3 line 63">Build</a></span>} &gt; <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4691_4712" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#BA_1353_1355" id="BA_4713_4715" title="Defined at line 42">BA</a></span> &gt; <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4718_4739" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#AM_2977_2979" id="AM_4740_4742" title="Defined at line 66">AM</a></span> &gt; <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4745_4766" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Seq_2093_2096" id="Seq_4767_4770" title="Defined at ../../core/strategies-namespaced.sdf3 line 65">Seq</a></span> &gt; <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4773_4794" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#LTrySome_3984_3992" id="LTrySome_4795_4803" title="Defined at line 80">LTrySome</a></span> &gt; {<span class="keyword">right</span> :
    <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4819_4840" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Choice_3438_3444" id="Choice_4841_4847" title="Defined at line 75">Choice</a></span>
    <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4852_4873" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#LChoice_1434_1441" id="LChoice_4874_4881" title="Defined at line 43">LChoice</a></span>
    <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4886_4907" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#RChoice_3531_3538" id="RChoice_4908_4915" title="Defined at line 76">RChoice</a></span>
    <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4920_4941" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#GuardedLChoice_2182_2196" id="GuardedLChoice_4942_4956" title="Defined at ../../core/strategies-namespaced.sdf3 line 66">GuardedLChoice</a></span>}

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_4986_5007" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#AnnoCong_3141_3149" id="AnnoCong_5008_5016" title="Defined at line 68">AnnoCong</a></span> &lt;0&gt;. &gt; {<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5025_5046" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Match_1883_1888" id="Match_5047_5052" title="Defined at ../../core/strategies-namespaced.sdf3 line 62">Match</a></span>
                                         <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5094_5115" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Build_1942_1947" id="Build_5116_5121" title="Defined at ../../core/strategies-namespaced.sdf3 line 63">Build</a></span>
                                         <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5163_5184" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Assign_3059_3065" id="Assign_5185_5191" title="Defined at line 67">Assign</a></span>
                                         <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5233_5254" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#BA_1353_1355" id="BA_5255_5257" title="Defined at line 42">BA</a></span>
                                         <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5299_5320" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#AM_2977_2979" id="AM_5321_5323" title="Defined at line 66">AM</a></span>},
  <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5328_5349" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#ExplodeCong_2883_2894" id="ExplodeCong_5350_5361" title="Defined at line 65">ExplodeCong</a></span> &lt;0&gt;. &gt; {<a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5370_5391" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Match_1883_1888" id="Match_5392_5397" title="Defined at ../../core/strategies-namespaced.sdf3 line 62">Match</a></span>
                                            <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5442_5463" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#Build_1942_1947" id="Build_5464_5469" title="Defined at ../../core/strategies-namespaced.sdf3 line 63">Build</a></span>
                                            <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5514_5535" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Assign_3059_3065" id="Assign_5536_5542" title="Defined at line 67">Assign</a></span>
                                            <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5587_5608" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#BA_1353_1355" id="BA_5609_5611" title="Defined at line 42">BA</a></span>
                                            <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5656_5677" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#AM_2977_2979" id="AM_5678_5680" title="Defined at line 66">AM</a></span>}

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5710_5731" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="../../core/strategies-namespaced.sdf3#GuardedLChoice_2182_2196" id="GuardedLChoice_5732_5746" title="Defined at ../../core/strategies-namespaced.sdf3 line 66">GuardedLChoice</a></span> &lt;2&gt;. &gt; <a href="#StrategoLang-Strategy_1078_1099" id="StrategoLang-Strategy_5754_5775" title="Defined at line 38, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 72, 73, 74, 75, 76, 77, 78, 79, 80, 86, 89">StrategoLang-Strategy</a>.<span class="cons_Constructor"><a href="#Choice_3438_3444" id="Choice_5776_5782" title="Defined at line 75">Choice</a></span>

</code></pre></td></tr></tbody></table></div>