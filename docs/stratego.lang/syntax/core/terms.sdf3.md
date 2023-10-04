---
title: terms.sdf3
hide:
  - toc
---

# `terms.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/terms.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/terms.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/terms.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/terms.sdf3#core/terms_29_39" id="core/terms_7_17" title="Referenced at ../../sugar/terms.sdf3 line 3">core/terms</a>

<span class="keyword">imports</span>
  <a href="../identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_29_45" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../constants.sdf3#core/constants_7_21" id="core/constants_48_62" title="Defined at ../constants.sdf3 line 1">core/constants</a>

<span class="keyword">context-free sorts</span> <a href="#ID_126_128" id="ID_83_85" title="Referenced at line 9; ../strategies.sdf3 line 61; ../../gradual-types/strategies.sdf3 line 44">ID</a> <a href="#Var_686_689" id="Var_86_89" title="Referenced at line 33; ../../deduplicated.sdf3 line 23; ../../sugar/terms.sdf3 line 33">Var</a> <a href="#Wld_455_458" id="Wld_90_93" title="Referenced at line 25; ../../sugar/terms.sdf3 line 34">Wld</a>
<span class="keyword">context-free syntax</span>
  <a href="#Var_686_689" id="Var_116_119" title="Referenced at line 33; ../../deduplicated.sdf3 line 23; ../../sugar/terms.sdf3 line 33">Var</a>.<span class="cons_Constructor"><span id="Var_120_123" title="Not referenced locally, nor via imports">Var</span></span> = <a href="#ID_83_85" id="ID_126_128" title="Defined at line 7, 10">ID</a>
  <a href="#ID_126_128" id="ID_131_133" title="Referenced at line 9; ../strategies.sdf3 line 61; ../../gradual-types/strategies.sdf3 line 44">ID</a>      = <a href="../identifiers.sdf3#Id_420_422" id="Id_141_143" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>
  <a href="#Wld_455_458" id="Wld_146_149" title="Referenced at line 25; ../../sugar/terms.sdf3 line 34">Wld</a>.<span class="cons_Constructor"><span id="Wld_150_153" title="Not referenced locally, nor via imports">Wld</span></span> = <span class="cons_Lit">"_"</span>

<span class="keyword">context-free sorts</span> <a href="#Term_758_762" id="Term_180_184" title="Referenced at line 37; ../strategies.sdf3 line 82; ../../deduplicated.sdf3 line 36; ../../sugar/dynamic-rules.sdf3 line 66; ../../sugar/overlays.sdf3 line 11; ../../sugar/rules.sdf3 line 42; ../../sugar/string-quotations.sdf3 line 92">Term</a> <span class="layout">// term with annotations</span>
<span class="keyword">context-free syntax</span>

  <a href="#Term_758_762" id="Term_233_237" title="Referenced at line 37; ../strategies.sdf3 line 82; ../../deduplicated.sdf3 line 36; ../../sugar/dynamic-rules.sdf3 line 66; ../../sugar/overlays.sdf3 line 11; ../../sugar/rules.sdf3 line 42; ../../sugar/string-quotations.sdf3 line 92">Term</a>      = <a href="#Var_86_89" id="Var_245_248" title="Defined at line 7, 9">Var</a>
  <a href="#Term_758_762" id="Term_251_255" title="Referenced at line 37; ../strategies.sdf3 line 82; ../../deduplicated.sdf3 line 36; ../../sugar/dynamic-rules.sdf3 line 66; ../../sugar/overlays.sdf3 line 11; ../../sugar/rules.sdf3 line 42; ../../sugar/string-quotations.sdf3 line 92">Term</a>      = <a href="#Wld_90_93" id="Wld_263_266" title="Defined at line 7, 11">Wld</a>
  <a href="#Term_758_762" id="Term_269_273" title="Referenced at line 37; ../strategies.sdf3 line 82; ../../deduplicated.sdf3 line 36; ../../sugar/dynamic-rules.sdf3 line 66; ../../sugar/overlays.sdf3 line 11; ../../sugar/rules.sdf3 line 42; ../../sugar/string-quotations.sdf3 line 92">Term</a>.<span class="cons_Constructor"><a href="#Anno_763_767" id="Anno_274_278" title="Referenced at line 37; ../../sugar/terms.sdf3 line 47">Anno</a></span> = &lt;&lt;<a href="#PreTerm_354_361" id="PreTerm_283_290" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>&gt;<span class="cons_String">{^</span>&lt;<a href="#PreTerm_354_361" id="PreTerm_294_301" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>&gt;<span class="cons_String">}</span>&gt;
  <a href="#Term_758_762" id="Term_307_311" title="Referenced at line 37; ../strategies.sdf3 line 82; ../../deduplicated.sdf3 line 36; ../../sugar/dynamic-rules.sdf3 line 66; ../../sugar/overlays.sdf3 line 11; ../../sugar/rules.sdf3 line 42; ../../sugar/string-quotations.sdf3 line 92">Term</a>.<span class="cons_Constructor"><a href="#As_752_754" id="As_312_314" title="Referenced at line 36">As</a></span>   = &lt;&lt;<a href="#Var_86_89" id="Var_321_324" title="Defined at line 7, 9">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#Term_180_184" id="Term_327_331" title="Defined at line 13, 16, 17, 18, 19">Term</a>&gt;&gt;

<span class="keyword">context-free sorts</span> <a href="#PreTerm_770_777" id="PreTerm_354_361" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a> <span class="layout">// term without annotations</span>
<span class="keyword">context-free syntax</span>

  <a href="#PreTerm_770_777" id="PreTerm_413_420" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>         = <a href="#Var_86_89" id="Var_431_434" title="Defined at line 7, 9">Var</a>
  <a href="#PreTerm_770_777" id="PreTerm_437_444" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>         = <a href="#Wld_90_93" id="Wld_455_458" title="Defined at line 7, 11">Wld</a>

  <a href="#PreTerm_770_777" id="PreTerm_462_469" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>.<span class="cons_Constructor"><span id="Int_470_473" title="Not referenced locally, nor via imports">Int</span></span>     = <a href="../constants.sdf3#Int_37_40" id="Int_480_483" title="Defined at ../constants.sdf3 line 3, 5">Int</a>
  <a href="#PreTerm_770_777" id="PreTerm_486_493" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>.<span class="cons_Constructor"><span id="Real_494_498" title="Not referenced locally, nor via imports">Real</span></span>    = <a href="../constants.sdf3#Real_41_45" id="Real_504_508" title="Defined at ../constants.sdf3 line 3, 7">Real</a>
  <a href="#PreTerm_770_777" id="PreTerm_511_518" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>.<span class="cons_Constructor"><span id="Str_519_522" title="Not referenced locally, nor via imports">Str</span></span>     = <a href="../constants.sdf3#String_46_52" id="String_529_535" title="Defined at ../constants.sdf3 line 3, 9">String</a>
  <a href="#PreTerm_770_777" id="PreTerm_538_545" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>.<span class="cons_Constructor"><span id="Op_546_548" title="Not referenced locally, nor via imports">Op</span></span>      = &lt;&lt;<a href="../identifiers.sdf3#Id_420_422" id="Id_558_560" title="Defined at ../identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_180_184" id="Term_564_568" title="Defined at line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#PreTerm_770_777" id="PreTerm_581_588" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>.<span class="cons_Constructor"><span id="OpQ_589_592" title="Not referenced locally, nor via imports">OpQ</span></span>     = &lt;&lt;<a href="../constants.sdf3#String_46_52" id="String_601_607" title="Defined at ../constants.sdf3 line 3, 9">String</a>&gt;<span class="cons_String">(</span>&lt;{<a href="#Term_180_184" id="Term_611_615" title="Defined at line 13, 16, 17, 18, 19">Term</a> <span class="cons_Lit">", "</span>}*&gt;<span class="cons_String">)</span>&gt;
  <a href="#PreTerm_770_777" id="PreTerm_628_635" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>.<span class="cons_Constructor"><a href="#Explode_737_744" id="Explode_636_643" title="Referenced at line 36; ../../sugar/terms.sdf3 line 48">Explode</a></span> = &lt;&lt;<a href="#Term_180_184" id="Term_648_652" title="Defined at line 13, 16, 17, 18, 19">Term</a>&gt;<span class="cons_String">#(</span>&lt;<a href="#Term_180_184" id="Term_656_660" title="Defined at line 13, 16, 17, 18, 19">Term</a>&gt;<span class="cons_String">)</span>&gt;
  <a href="#PreTerm_770_777" id="PreTerm_666_673" title="Referenced at line 37; ../../gradual-types/terms.sdf3 line 13">PreTerm</a>.<span class="cons_Constructor"><a href="#AsPT_778_782" id="AsPT_674_678" title="Referenced at line 37; ../../sugar/terms.sdf3 line 44">AsPT</a></span>    = &lt;&lt;<a href="#Var_86_89" id="Var_686_689" title="Defined at line 7, 9">Var</a>&gt;<span class="cons_String">@</span>&lt;<a href="#PreTerm_354_361" id="PreTerm_692_699" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>&gt;&gt;

<span class="keyword">context-free priorities</span>
  <a href="#PreTerm_354_361" id="PreTerm_729_736" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>.<span class="cons_Constructor"><a href="#Explode_636_643" id="Explode_737_744" title="Defined at line 32">Explode</a></span> &gt; <a href="#Term_180_184" id="Term_747_751" title="Defined at line 13, 16, 17, 18, 19">Term</a>.<span class="cons_Constructor"><a href="#As_312_314" id="As_752_754" title="Defined at line 19">As</a></span>,
  <a href="#Term_180_184" id="Term_758_762" title="Defined at line 13, 16, 17, 18, 19">Term</a>.<span class="cons_Constructor"><a href="#Anno_274_278" id="Anno_763_767" title="Defined at line 18">Anno</a></span> &gt; <a href="#PreTerm_354_361" id="PreTerm_770_777" title="Defined at line 21, 24, 25, 27, 28, 29, 30, 31, 32, 33">PreTerm</a>.<span class="cons_Constructor"><a href="#AsPT_674_678" id="AsPT_778_782" title="Defined at line 33">AsPT</a></span>

</code></pre></td></tr></tbody></table></div>