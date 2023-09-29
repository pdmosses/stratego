---
title: rules-namespaced.sdf3
---

# `rules-namespaced.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/rules-namespaced.sdf3]

[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/rules-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/rules-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../strategies-namespaced.sdf3#StrategoLang/sugar/rules-namespaced_265_300" id="StrategoLang/sugar/rules-namespaced_7_42" title="Referenced at ../strategies-namespaced.sdf3 line 9">StrategoLang/sugar/rules-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_54_94" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_7_46" id="StrategoLang/core/signatures-namespaced_98_137" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_141_175" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_179_218" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../terms-namespaced.sdf3#StrategoLang/sugar/terms-namespaced_7_42" id="StrategoLang/sugar/terms-namespaced_222_257" title="Defined at ../terms-namespaced.sdf3 line 1">StrategoLang/sugar/terms-namespaced</a>        
  <a href="../strategies-namespaced.sdf3#StrategoLang/sugar/strategies-namespaced_7_47" id="StrategoLang/sugar/strategies-namespaced_261_301" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/sugar/strategies-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">tokenize</span> : ")(|"

<span class="keyword">sorts</span> <a href="#StrategoLang-RuleDef_568_588" id="StrategoLang-RuleDef_347_367" title="Referenced at line 21">StrategoLang-RuleDef</a> <a href="#StrategoLang-RDefT_1105_1123" id="StrategoLang-RDefT_368_386" title="Referenced at line 30">StrategoLang-RDefT</a> <a href="#StrategoLang-RDefP_920_938" id="StrategoLang-RDefP_387_405" title="Referenced at line 27">StrategoLang-RDefP</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-RuleDef_568_588" id="StrategoLang-RuleDef_430_450" title="Referenced at line 21">StrategoLang-RuleDef</a>.<span class="cons_Constructor"><span id="RDefNoArgs_451_461" title="Not referenced locally, nor via imports">RDefNoArgs</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_466_482" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">:</span>
  &lt;<a href="#StrategoLang-Rule_1140_1157" id="StrategoLang-Rule_488_505" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <span id="StrategoLang-Def_514_530" title="Not referenced locally, nor via imports">StrategoLang-Def</span>.<span class="cons_Constructor"><span id="AnnoRuleDef_531_542" title="Not referenced locally, nor via imports">AnnoRuleDef</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Anno_1241_1258" id="StrategoLang-Anno_547_564" title="Defined at ../../core/strategies-namespaced.sdf3 line 40, 44, 45, 46">StrategoLang-Anno</a>+&gt; &lt;<a href="#StrategoLang-RuleDef_347_367" id="StrategoLang-RuleDef_568_588" title="Defined at line 15, 19, 22, 24, 27">StrategoLang-RuleDef</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleDef_568_588" id="StrategoLang-RuleDef_597_617" title="Referenced at line 21">StrategoLang-RuleDef</a>.<span class="cons_Constructor"><span id="RDef_618_622" title="Not referenced locally, nor via imports">RDef</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_627_643" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_647_667" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#StrategoLang-Rule_1140_1157" id="StrategoLang-Rule_681_698" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleDef_568_588" id="StrategoLang-RuleDef_707_727" title="Referenced at line 21">StrategoLang-RuleDef</a> = <a href="#StrategoLang-RDefT_368_386" id="StrategoLang-RDefT_730_748" title="Defined at line 15, 25">StrategoLang-RDefT</a> { }
  <a href="#StrategoLang-RDefT_1105_1123" id="StrategoLang-RDefT_755_773" title="Referenced at line 30">StrategoLang-RDefT</a>.<span class="cons_Constructor"><span id="RDefT_774_779" title="Not referenced locally, nor via imports">RDefT</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_784_800" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_804_824" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_837_857" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">):</span>
  &lt;<a href="#StrategoLang-Rule_1140_1157" id="StrategoLang-Rule_871_888" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleDef_568_588" id="StrategoLang-RuleDef_897_917" title="Referenced at line 21">StrategoLang-RuleDef</a> = <a href="#StrategoLang-RDefP_387_405" id="StrategoLang-RDefP_920_938" title="Defined at line 15, 28, 30">StrategoLang-RDefP</a> { }
  <a href="#StrategoLang-RDefP_920_938" id="StrategoLang-RDefP_945_963" title="Referenced at line 27">StrategoLang-RDefP</a>.<span class="cons_Constructor"><span id="RDefP_964_969" title="Not referenced locally, nor via imports">RDefP</span></span> = &lt;&lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-SId_1108_1124" id="StrategoLang-SId_974_990" title="Defined at ../../core/strategies-namespaced.sdf3 line 36">StrategoLang-SId</a>&gt;<span class="cons_String">(</span>&lt;{<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Typedid_1422_1442" id="StrategoLang-Typedid_994_1014" title="Defined at ../../core/strategies-namespaced.sdf3 line 48, 52">StrategoLang-Typedid</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;{<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1027_1044" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a> <span class="cons_Lit">", "</span>}+&gt;<span class="cons_String">):</span>
  &lt;<a href="#StrategoLang-Rule_1140_1157" id="StrategoLang-Rule_1058_1075" title="Defined at line 32, 36">StrategoLang-Rule</a>&gt;&gt; { }
  <a href="#StrategoLang-RDefP_920_938" id="StrategoLang-RDefP_1084_1102" title="Referenced at line 27">StrategoLang-RDefP</a> = <a href="#StrategoLang-RDefT_368_386" id="StrategoLang-RDefT_1105_1123" title="Defined at line 15, 25">StrategoLang-RDefT</a> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <a href="#StrategoLang-Rule_1058_1075" id="StrategoLang-Rule_1140_1157" title="Referenced at line 29; ../strategies-namespaced.sdf3 line 74">StrategoLang-Rule</a> <a href="#StrategoLang-RuleCond_1277_1298" id="StrategoLang-RuleCond_1158_1179" title="Referenced at line 37">StrategoLang-RuleCond</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Rule_1058_1075" id="StrategoLang-Rule_1204_1221" title="Referenced at line 29; ../strategies-namespaced.sdf3 line 74">StrategoLang-Rule</a>.<span class="cons_Constructor"><span id="Rule_1222_1226" title="Not referenced locally, nor via imports">Rule</span></span> = [[<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1231_1248" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>] <span class="cons_String">-&gt;</span> [<a href="../../core/terms-namespaced.sdf3#StrategoLang-Term_340_357" id="StrategoLang-Term_1254_1271" title="Defined at ../../core/terms-namespaced.sdf3 line 15, 19, 20, 21, 22">StrategoLang-Term</a>]
  [{<a href="#StrategoLang-RuleCond_1158_1179" id="StrategoLang-RuleCond_1277_1298" title="Defined at line 32, 38, 40">StrategoLang-RuleCond</a> <span class="cons_Lit">"\n"</span>}*]] { }
  <a href="#StrategoLang-RuleCond_1277_1298" id="StrategoLang-RuleCond_1314_1335" title="Referenced at line 37">StrategoLang-RuleCond</a>.<span class="cons_Constructor"><span id="WhereClause_1336_1347" title="Not referenced locally, nor via imports">WhereClause</span></span> = &lt;<span class="cons_String">where</span>
  &lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_1360_1381" title="Defined at ../../core/strategies-namespaced.sdf3 line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }
  <a href="#StrategoLang-RuleCond_1277_1298" id="StrategoLang-RuleCond_1390_1411" title="Referenced at line 37">StrategoLang-RuleCond</a>.<span class="cons_Constructor"><span id="WithClause_1412_1422" title="Not referenced locally, nor via imports">WithClause</span></span> = &lt;<span class="cons_String">with</span>
  &lt;<a href="../../core/strategies-namespaced.sdf3#StrategoLang-Strategy_1553_1574" id="StrategoLang-Strategy_1434_1455" title="Defined at ../../core/strategies-namespaced.sdf3 line 54, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 72, 77, 78, 79">StrategoLang-Strategy</a>&gt;&gt; { }

</code></pre></td></tr></tbody></table></div>