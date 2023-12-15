---
title: terms.sdf3
hide:
  - toc
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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="sugar/terms_1_8" title="Multi-file references" data-urls="../main.sdf3/#sugar/terms_10_3 line 10; ../rules.sdf3/#sugar/terms_8_5 line 8; ../strategies.sdf3/#sugar/terms_7_3 line 7; ../../deduplicated.sdf3/#sugar/terms_8_3 line 8; ../../gradual-types/terms.sdf3/#sugar/terms_4_3 line 4">sugar/terms</button>
<span class="keyword">imports</span>
  <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_3_3" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../constants.sdf3/#sugar/constants_1_8" id="sugar/constants_5_3" title="Defined at ../constants.sdf3 line 1">sugar/constants</a>
  <a href="../strategies.sdf3/#sugar/strategies_1_8" id="sugar/strategies_6_3" title="Defined at ../strategies.sdf3 line 1">sugar/strategies</a>

<span class="keyword">context-free syntax</span>
  <a href="../strategies.sdf3/#ID_33_27" id="ID_9_3" title="Referenced at ../strategies.sdf3 line 33">ID</a>.<span class="cons_Constructor"><span id="ListVar_9_6" title="Not referenced">ListVar</span></span>        = <a href="../../core/identifiers.sdf3/#LId_16_18" id="LId_9_23" title="Defined at ../../core/identifiers.sdf3 line 16, 22">LId</a>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Term_13_3" title="Multi-file references" data-urls="#Term_13_26 line 13, 14, 16, 22, 24, 25, 26, 36, 43, 47, 48; ../strategies.sdf3/#Term_28_28 line 28, 42, 52, 67, 68">Term</button>.<span class="cons_Constructor"><button class="modal-open" id="BuildDefault_13_8" title="Multi-file references" data-urls="#BuildDefault_48_51 line 48; ../../gradual-types/terms.sdf3/#BuildDefault_13_33 line 13">BuildDefault</button></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#Term_13_3" id="Term_13_26" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>&gt;&gt;
  <button class="modal-open" id="Term_14_3" title="Multi-file references" data-urls="#Term_13_26 line 13, 14, 16, 22, 24, 25, 26, 36, 43, 47, 48; ../strategies.sdf3/#Term_28_28 line 28, 42, 52, 67, 68">Term</button>.<span class="cons_Constructor"><a href="#AnnoList_43_8" id="AnnoList_14_8" title="Referenced at line 43">AnnoList</a></span>     = &lt;&lt;<a href="#PreTerm_21_3" id="PreTerm_14_25" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>&gt;<span class="cons_String">{</span>&lt;{<a href="#Term_13_3" id="Term_14_36" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">}</span>&gt;
  <button class="modal-open" id="Term_15_3" title="Multi-file references" data-urls="#Term_13_26 line 13, 14, 16, 22, 24, 25, 26, 36, 43, 47, 48; ../strategies.sdf3/#Term_28_28 line 28, 42, 52, 67, 68">Term</button>.<span class="cons_Constructor"><a href="#NoAnnoList_36_8" id="NoAnnoList_15_8" title="Referenced at line 36">NoAnnoList</a></span>   = <a href="#PreTerm_21_3" id="PreTerm_15_23" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>
  <button class="modal-open" id="Term_16_3" title="Multi-file references" data-urls="#Term_13_26 line 13, 14, 16, 22, 24, 25, 26, 36, 43, 47, 48; ../strategies.sdf3/#Term_28_28 line 28, 42, 52, 67, 68">Term</button>.<span class="cons_Constructor"><button class="modal-open" id="App_16_8" title="Multi-file references" data-urls="#App_48_28 line 48; ../../gradual-types/terms.sdf3/#App_13_10 line 13">App</button></span>          = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3/#Strategy_38_3" id="Strategy_16_26" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#Term_13_3" id="Term_16_38" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>]]
  <button class="modal-open" id="Term_17_3" title="Multi-file references" data-urls="#Term_13_26 line 13, 14, 16, 22, 24, 25, 26, 36, 43, 47, 48; ../strategies.sdf3/#Term_28_28 line 28, 42, 52, 67, 68">Term</button>.<span class="cons_Constructor"><span id="RootApp_17_8" title="Not referenced">RootApp</span></span>      = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3/#Strategy_38_3" id="Strategy_17_26" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span>]

<span class="keyword">context-free syntax</span>

  <a href="#PreTerm_14_25" id="PreTerm_21_3" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a>.<span class="cons_Constructor"><span id="Char_21_11" title="Not referenced">Char</span></span>      = <a href="../constants.sdf3/#Char_8_15" id="Char_21_23" title="Defined at ../constants.sdf3 line 8, 10">Char</a>
  <a href="#PreTerm_14_25" id="PreTerm_22_3" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a>.<span class="cons_Constructor"><button class="modal-open" id="AppPT_22_11" title="Multi-file references" data-urls="#AppPT_38_13 line 38, 45, 47, 48; ../../gradual-types/terms.sdf3/#AppPT_13_22 line 13">AppPT</button></span>     = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3/#Strategy_38_3" id="Strategy_22_26" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span> [<a href="#Term_13_3" id="Term_22_38" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>]]
  <a href="#PreTerm_14_25" id="PreTerm_23_3" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_39_13" id="RootAppPT_23_11" title="Referenced at line 39">RootAppPT</a></span> = [<span class="cons_String">&lt;</span>[<a href="../strategies.sdf3/#Strategy_38_3" id="Strategy_23_26" title="Defined at ../strategies.sdf3 line 38, 41, 42, 43, 45, 46, 47, 48, 50, 51, 52, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 70, 76, 77, 78, 79, 80, 81, 82, 83, 84, 88, 93">Strategy</a>]<span class="cons_String">&gt;</span>]
  <a href="#PreTerm_14_25" id="PreTerm_24_3" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a>.<span class="cons_Constructor"><span id="Tuple_24_11" title="Not referenced">Tuple</span></span>     = &lt;<span class="cons_String">(</span>&lt;{<a href="#Term_13_3" id="Term_24_27" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#PreTerm_14_25" id="PreTerm_25_3" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a>.<span class="cons_Constructor"><span id="List_25_11" title="Not referenced">List</span></span>      = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_13_3" id="Term_25_27" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">]</span>&gt;
  <a href="#PreTerm_14_25" id="PreTerm_26_3" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a>.<span class="cons_Constructor"><span id="ListTail_26_11" title="Not referenced">ListTail</span></span>  = &lt;<span class="cons_String">[</span>&lt;{<a href="#Term_13_3" id="Term_26_27" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a> <span class="cons_Lit">", "</span>}+&gt; <span class="cons_String">|</span> &lt;<a href="#Term_13_3" id="Term_26_43" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>&gt;<span class="cons_String">]</span>&gt;

  <a href="#PreTerm_14_25" id="PreTerm_28_3" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_40_13" id="BuildDefaultPT_28_11" title="Referenced at line 40, 48">BuildDefaultPT</a></span> = &lt;<span class="cons_String">_</span>&lt;<a href="#PreTerm_21_3" id="PreTerm_28_31" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>&gt;&gt;

<span class="keyword">context-free priorities</span>
<span class="layout">// replacement for prefer on Term duplicates of PreTerm rules</span>
  <button class="modal-open" id="Term_32_3" title="Multi-file references" data-urls="#Term_13_26 line 13, 14, 16, 22, 24, 25, 26, 36, 43, 47, 48; ../strategies.sdf3/#Term_28_28 line 28, 42, 52, 67, 68">Term</button>.<span class="cons_Constructor"><a href="#NoAnnoList_36_8" id="NoAnnoList_32_8" title="Referenced at line 36">NoAnnoList</a></span> = <a href="#PreTerm_21_3" id="PreTerm_32_21" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a> &lt;0&gt; .&gt; {
    <a href="#PreTerm_14_25" id="PreTerm_33_5" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a> = <a href="../../core/terms.sdf3/#Var_7_23" id="Var_33_15" title="Defined at ../../core/terms.sdf3 line 7, 9">Var</a>
    <a href="#PreTerm_14_25" id="PreTerm_34_5" title="Referenced at line 14, 15, 28, 32, 37, 38, 39, 40, 44, 45, 47, 48">PreTerm</a> = <a href="../../core/terms.sdf3/#Wld_7_27" id="Wld_34_15" title="Defined at ../../core/terms.sdf3 line 7, 11">Wld</a>
  }
, <a href="#Term_13_3" id="Term_36_3" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#NoAnnoList_15_8" id="NoAnnoList_36_8" title="Defined at line 15, 32">NoAnnoList</a></span> &lt;0&gt; .&gt; {
    <a href="#PreTerm_21_3" id="PreTerm_37_5" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3/#AsPT_33_11" id="AsPT_37_13" title="Defined at ../../core/terms.sdf3 line 33">AsPT</a></span>
    <a href="#PreTerm_21_3" id="PreTerm_38_5" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_22_11" id="AppPT_38_13" title="Defined at line 22">AppPT</a></span>
    <a href="#PreTerm_21_3" id="PreTerm_39_5" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#RootAppPT_23_11" id="RootAppPT_39_13" title="Defined at line 23">RootAppPT</a></span>
    <a href="#PreTerm_21_3" id="PreTerm_40_5" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_28_11" id="BuildDefaultPT_40_13" title="Defined at line 28">BuildDefaultPT</a></span>
  }
<span class="layout">// AnnoList binds tighter</span>
, <a href="#Term_13_3" id="Term_43_3" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#AnnoList_14_8" id="AnnoList_43_8" title="Defined at line 14">AnnoList</a></span> &gt; {
    <a href="#PreTerm_21_3" id="PreTerm_44_5" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3/#AsPT_33_11" id="AsPT_44_13" title="Defined at ../../core/terms.sdf3 line 33">AsPT</a></span>
    <a href="#PreTerm_21_3" id="PreTerm_45_5" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_22_11" id="AppPT_45_13" title="Defined at line 22">AppPT</a></span>
  }
, <a href="#Term_13_3" id="Term_47_3" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3/#Anno_18_8" id="Anno_47_8" title="Defined at ../../core/terms.sdf3 line 18">Anno</a></span> &gt; <a href="#PreTerm_21_3" id="PreTerm_47_15" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_22_11" id="AppPT_47_23" title="Defined at line 22">AppPT</a></span>
, <a href="#PreTerm_21_3" id="PreTerm_48_3" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="../../core/terms.sdf3/#Explode_32_11" id="Explode_48_11" title="Defined at ../../core/terms.sdf3 line 32">Explode</a></span> &gt; { <a href="#Term_13_3" id="Term_48_23" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#App_16_8" id="App_48_28" title="Defined at line 16">App</a></span> <a href="#PreTerm_21_3" id="PreTerm_48_32" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#AppPT_22_11" id="AppPT_48_40" title="Defined at line 22">AppPT</a></span> <a href="#Term_13_3" id="Term_48_46" title="Defined at line 13, 14, 15, 16, 17, 32">Term</a>.<span class="cons_Constructor"><a href="#BuildDefault_13_8" id="BuildDefault_48_51" title="Defined at line 13">BuildDefault</a></span> <a href="#PreTerm_21_3" id="PreTerm_48_64" title="Defined at line 21, 22, 23, 24, 25, 26, 28, 33, 34">PreTerm</a>.<span class="cons_Constructor"><a href="#BuildDefaultPT_28_11" id="BuildDefaultPT_48_72" title="Defined at line 28">BuildDefaultPT</a></span> }
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
