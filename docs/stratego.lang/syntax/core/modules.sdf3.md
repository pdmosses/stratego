---
title: modules.sdf3
hide:
  - toc
---

# `modules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/core/modules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/core/modules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/core/modules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="core/modules_1_8" title="Multi-file references" data-urls="../main.sdf3/#core/modules_10_3 line 10; ../../StrategoLang.sdf3/#core/modules_5_3 line 5; ../../gradual-types/internal.sdf3/#core/modules_6_3 line 6; ../../sugar/main.sdf3/#core/modules_5_3 line 5; ../../sugar/modules.sdf3/#core/modules_3_3 line 3">core/modules</button>

<span class="keyword">imports</span>
  <a href="../identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../layout.sdf3/#core/layout_1_8" id="core/layout_5_3" title="Defined at ../layout.sdf3 line 1">core/layout</a>
  <a href="../signatures.sdf3/#core/signatures_1_8" id="core/signatures_6_3" title="Defined at ../signatures.sdf3 line 1">core/signatures</a>
  <a href="../strategies.sdf3/#core/strategies_1_8" id="core/strategies_7_3" title="Defined at ../strategies.sdf3 line 1">core/strategies</a>

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Module_9_20" title="Multi-file references" data-urls="../../StrategoLang.sdf3/#Module_7_28 line 7; ../../gradual-types/internal.sdf3/#Module_15_7 line 15">Module</button>
<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="Module_12_3" title="Multi-file references" data-urls="../../StrategoLang.sdf3/#Module_7_28 line 7; ../../gradual-types/internal.sdf3/#Module_15_7 line 15">Module</button>.<span class="cons_Constructor"><span id="Module_12_10" title="Not referenced">Module</span></span> =
&lt;<span class="cons_String">module</span> &lt;<a href="../identifiers.sdf3/#ModName_3_15" id="ModName_13_10" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a>&gt;

&lt;{<a href="#AnnoDecl_22_25" id="AnnoDecl_15_3" title="Defined at line 22, 38">AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <button class="modal-open" id="Module_17_3" title="Multi-file references" data-urls="../../StrategoLang.sdf3/#Module_7_28 line 7; ../../gradual-types/internal.sdf3/#Module_15_7 line 15">Module</button>.<span class="cons_Constructor"><span id="Specification_17_10" title="Not referenced">Specification</span></span> =
&lt;<span class="cons_String">specification</span>

&lt;{<a href="#AnnoDecl_22_25" id="AnnoDecl_20_3" title="Defined at line 22, 38">AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

<span class="keyword">context-free sorts</span> <a href="#Decl_38_14" id="Decl_22_20" title="Referenced at line 38">Decl</a> <a href="#AnnoDecl_15_3" id="AnnoDecl_22_25" title="Referenced at line 15, 20">AnnoDecl</a>
<span class="keyword">context-free syntax</span>
  <a href="#Decl_38_14" id="Decl_24_3" title="Referenced at line 38">Decl</a>.<span class="cons_Constructor"><span id="Imports_24_8" title="Not referenced">Imports</span></span> =
&lt;<span class="cons_String">imports</span>

&lt;{<a href="#ImportModName_40_20" id="ImportModName_27_3" title="Defined at line 40, 42, 45">ImportModName</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt;

  <a href="#Decl_38_14" id="Decl_29_3" title="Referenced at line 38">Decl</a>.<span class="cons_Constructor"><span id="Strategies_29_8" title="Not referenced">Strategies</span></span> = 
&lt;<span class="cons_String">strategies</span>

&lt;{<a href="../strategies.sdf3/#Def_13_20" id="Def_32_3" title="Defined at ../strategies.sdf3 line 13, 15, 25">Def</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <a href="#Decl_38_14" id="Decl_34_3" title="Referenced at line 38">Decl</a>.<span class="cons_Constructor"><span id="Signature_34_8" title="Not referenced">Signature</span></span> =
&lt;<span class="cons_String">signature</span>
&lt;{<a href="../signatures.sdf3/#Sdecl_20_20" id="Sdecl_36_3" title="Defined at ../signatures.sdf3 line 20, 23, 26">Sdecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt;

  <a href="#AnnoDecl_15_3" id="AnnoDecl_38_3" title="Referenced at line 15, 20">AnnoDecl</a> = <a href="#Decl_22_20" id="Decl_38_14" title="Defined at line 22, 24, 29, 34">Decl</a>

<span class="keyword">context-free sorts</span> <a href="#ImportModName_27_3" id="ImportModName_40_20" title="Referenced at line 27">ImportModName</a>
<span class="keyword">context-free syntax</span>
  <a href="#ImportModName_27_3" id="ImportModName_42_3" title="Referenced at line 27">ImportModName</a>.<span class="cons_Constructor"><span id="Import_42_17" title="Not referenced">Import</span></span> = <a href="../identifiers.sdf3/#ModName_3_15" id="ModName_42_26" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a>

<span class="keyword">syntax</span>
  <a href="#ImportModName_27_3" id="ImportModName_45_3" title="Referenced at line 27">ImportModName</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ImportWildcard_45_20" title="Not referenced">ImportWildcard</span></span> = <a href="../identifiers.sdf3/#ModName_3_15" id="ModName_45_37" title="Defined at ../identifiers.sdf3 line 3, 5, 10, 11, 12, 13, 14">ModName</a><span class="keyword">-CF</span> <span class="cons_Lit">"/"</span> <span class="cons_Lit">"-"</span>


</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
