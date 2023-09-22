---
title: terms.sdf3
---

# `terms.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/sugar/terms.sdf3]

[pdmosses/stratego/stratego.lang/syntax/sugar/terms.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/sugar/terms.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../strategies.sdf3#sugar/terms_101_112" id="sugar/terms_7_18" title="Referenced at ../strategies.sdf3 line 7">sugar/terms</a>
<span class="keyword">imports</span>
  <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_29_39" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_42_58" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../constants.sdf3#sugar/constants_7_22" id="sugar/constants_61_76" title="Defined at ../constants.sdf3 line 1">sugar/constants</a>
  <a href="../strategies.sdf3#sugar/strategies_7_23" id="sugar/strategies_79_95" title="Defined at ../strategies.sdf3 line 1">sugar/strategies</a>

<span class="keyword">context-free syntax</span>
  <a href="../strategies.sdf3#ID_589_591" id="ID_119_121" title="Referenced at ../strategies.sdf3 line 33">ID</a>.<span class="cons_Constructor"><span id="ListVar_122_129" title="Not referenced locally, nor via imports">ListVar</span></span>        = <a href="../../core/identifiers.sdf3#LId_423_426" id="LId_139_142" title="Defined at ../../core/identifiers.sdf3 line 16, 22">LId</a>

<span class="keyword">context-free syntax</span>

  <a href="#Term_1098_1102" id="Term_167_171" title="Referenced at line 48; ../strategies.sdf3 line 68">Term</a>.<span class="cons_Constructor"><a href="#BuildDefault_1103_1115" id="BuildDefault_172_184" title="Referenced at line 48; ../../gradual-types/terms.sdf3 line 13">BuildDefault</a></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#Term_167_171" id="Term_190_194" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>&gt;&gt;
  <a href="#Term_1098_1102" id="Term_199_203" title="Referenced at line 48; ../strategies.sdf3 line 68">Term</a>.<span class="cons_Constructor"><a href="#AnnoList_973_981" id="AnnoList_204_212" title="Referenced at line 43">AnnoList</a></span>     = &lt;&lt;<a href="#PreTerm_382_389" id="PreTerm_221_228" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>&gt;<span class="cons_String">{</span>&lt;{<a href="#Term_167_171" id="Term_232_236" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span>&gt;
  <a href="#Term_1098_1102" id="Term_249_253" title="Referenced at line 48; ../strategies.sdf3 line 68">Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_832_842" id="NoAnnoList_254_264" title="Referenced at line 36">NoAnnoList</a></span>   = <a href="#PreTerm_382_389" id="PreTerm_269_276" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>
  <a href="#Term_1098_1102" id="Term_279_283" title="Referenced at line 48; ../strategies.sdf3 line 68">Term</a>.<span class="cons_Constructor"><a href="#App_1080_1083" id="App_284_287" title="Referenced at line 48; ../../gradual-types/terms.sdf3 line 13">App</a></span>          = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3#Strategy_645_653" id="Strategy_302_310" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#Term_167_171" id="Term_314_318" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>]]
  <a href="#Term_1098_1102" id="Term_323_327" title="Referenced at line 48; ../strategies.sdf3 line 68">Term</a>.<span class="cons_Constructor"><span id="RootApp_328_335" title="Not referenced locally, nor via imports">RootApp</span></span>      = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3#Strategy_645_653" id="Strategy_346_354" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span>]

<span class="keyword">context-free syntax</span>

  <a href="#PreTerm_1116_1123" id="PreTerm_382_389" title="Referenced at line 48">PreTerm</a>.<span class="cons_Constructor"><span id="Char_390_394" title="Not referenced locally, nor via imports">Char</span></span>      = <a href="../constants.sdf3#Char_109_113" id="Char_402_406" title="Defined at ../constants.sdf3 line 8, 10">Char</a>
  <a href="#PreTerm_1116_1123" id="PreTerm_409_416" title="Referenced at line 48">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_1092_1097" id="AppPT_417_422" title="Referenced at line 48; ../../gradual-types/terms.sdf3 line 13">AppPT</a></span>     = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3#Strategy_645_653" id="Strategy_432_440" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#Term_167_171" id="Term_444_448" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>]]
  <a href="#PreTerm_1116_1123" id="PreTerm_453_460" title="Referenced at line 48">PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_899_908" id="RootAppPT_461_470" title="Referenced at line 39">RootAppPT</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3#Strategy_645_653" id="Strategy_476_484" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span>]
  <a href="#PreTerm_1116_1123" id="PreTerm_490_497" title="Referenced at line 48">PreTerm</a>.<span class="cons_Constructor"><span id="Tuple_498_503" title="Not referenced locally, nor via imports">Tuple</span></span>     = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_167_171" id="Term_514_518" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#PreTerm_1116_1123" id="PreTerm_531_538" title="Referenced at line 48">PreTerm</a>.<span class="cons_Constructor"><span id="List_539_543" title="Not referenced locally, nor via imports">List</span></span>      = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_167_171" id="Term_555_559" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt;
  <a href="#PreTerm_1116_1123" id="PreTerm_572_579" title="Referenced at line 48">PreTerm</a>.<span class="cons_Constructor"><span id="ListTail_580_588" title="Not referenced locally, nor via imports">ListTail</span></span>  = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_167_171" id="Term_596_600" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">|</span> &lt;<a href="#Term_167_171" id="Term_612_616" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>&gt;<span class="cons_String">]</span>&gt;

  <a href="#PreTerm_1116_1123" id="PreTerm_623_630" title="Referenced at line 48">PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_1124_1138" id="BuildDefaultPT_631_645" title="Referenced at line 48">BuildDefaultPT</a></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#PreTerm_382_389" id="PreTerm_651_658" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>&gt;&gt;

<span class="keyword">context-free priorities</span>
<span class="layout">// replacement for prefer on Term duplicates of PreTerm rules</span>
  <a href="#Term_1098_1102" id="Term_750_754" title="Referenced at line 48; ../strategies.sdf3 line 68">Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_832_842" id="NoAnnoList_755_765" title="Referenced at line 36">NoAnnoList</a></span> = <a href="#PreTerm_382_389" id="PreTerm_768_775" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a> &lt;0&gt; .&gt; {
    <a href="#PreTerm_1116_1123" id="PreTerm_789_796" title="Referenced at line 48">PreTerm</a> = <a href="../../core/terms.sdf3#Var_86_89" id="Var_799_802" title="Defined at ../../core/terms.sdf3 line 7, 9">Var</a>
    <a href="#PreTerm_1116_1123" id="PreTerm_807_814" title="Referenced at line 48">PreTerm</a> = <a href="../../core/terms.sdf3#Wld_90_93" id="Wld_817_820" title="Defined at ../../core/terms.sdf3 line 7, 11">Wld</a>
  }
, <a href="#Term_167_171" id="Term_827_831" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_254_264" id="NoAnnoList_832_842" title="Defined at line 15, 32">NoAnnoList</a></span> &lt;0&gt; .&gt; {
    <a href="#PreTerm_382_389" id="PreTerm_856_863" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3#AsPT_674_678" id="AsPT_864_868" title="Defined at ../../core/terms.sdf3 line 33">AsPT</a></span>
    <a href="#PreTerm_382_389" id="PreTerm_873_880" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_417_422" id="AppPT_881_886" title="Defined at line 22">AppPT</a></span>
    <a href="#PreTerm_382_389" id="PreTerm_891_898" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_461_470" id="RootAppPT_899_908" title="Defined at line 23">RootAppPT</a></span>
    <a href="#PreTerm_382_389" id="PreTerm_913_920" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_631_645" id="BuildDefaultPT_921_935" title="Defined at line 28">BuildDefaultPT</a></span>
  }
<span class="layout">// AnnoList binds tighter</span>
, <a href="#Term_167_171" id="Term_968_972" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#AnnoList_204_212" id="AnnoList_973_981" title="Defined at line 14">AnnoList</a></span> &gt; {
    <a href="#PreTerm_382_389" id="PreTerm_990_997" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3#AsPT_674_678" id="AsPT_998_1002" title="Defined at ../../core/terms.sdf3 line 33">AsPT</a></span>
    <a href="#PreTerm_382_389" id="PreTerm_1007_1014" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_417_422" id="AppPT_1015_1020" title="Defined at line 22">AppPT</a></span>
  }
, <a href="#Term_167_171" id="Term_1027_1031" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3#Anno_274_278" id="Anno_1032_1036" title="Defined at ../../core/terms.sdf3 line 18">Anno</a></span> &gt; <a href="#PreTerm_382_389" id="PreTerm_1039_1046" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_417_422" id="AppPT_1047_1052" title="Defined at line 22">AppPT</a></span>
, <a href="#PreTerm_382_389" id="PreTerm_1055_1062" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3#Explode_636_643" id="Explode_1063_1070" title="Defined at ../../core/terms.sdf3 line 32">Explode</a></span> &gt; { <a href="#Term_167_171" id="Term_1075_1079" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#App_284_287" id="App_1080_1083" title="Defined at line 16">App</a></span> <a href="#PreTerm_382_389" id="PreTerm_1084_1091" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_417_422" id="AppPT_1092_1097" title="Defined at line 22">AppPT</a></span> <a href="#Term_167_171" id="Term_1098_1102" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#BuildDefault_172_184" id="BuildDefault_1103_1115" title="Defined at line 13">BuildDefault</a></span> <a href="#PreTerm_382_389" id="PreTerm_1116_1123" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_631_645" id="BuildDefaultPT_1124_1138" title="Defined at line 28">BuildDefaultPT</a></span> }
</code></pre></td></tr></tbody></table></div>