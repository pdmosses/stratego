---
title: modules-namespaced.sdf3
hide:
  - toc
---

# `modules-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/core/modules-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/core/modules-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../../sugar/modules-namespaced.sdf3#StrategoLang/core/modules-namespaced_56_92" id="StrategoLang/core/modules-namespaced_7_43" title="Referenced at ../../sugar/modules-namespaced.sdf3 line 4">StrategoLang/core/modules-namespaced</a>

<span class="keyword">imports</span>
  <a href="../identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_55_95" title="Defined at ../identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../layout-namespaced.sdf3#StrategoLang/core/layout-namespaced_7_42" id="StrategoLang/core/layout-namespaced_99_134" title="Defined at ../layout-namespaced.sdf3 line 1">StrategoLang/core/layout-namespaced</a>        
  <a href="../signatures-namespaced.sdf3#StrategoLang/core/signatures-namespaced_7_46" id="StrategoLang/core/signatures-namespaced_138_177" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_181_220" title="Defined at ../strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>

<span class="keyword">sorts</span> <a href="../../gradual-types/internal-namespaced.sdf3#StrategoLang-Module_500_519" id="StrategoLang-Module_228_247" title="Referenced at ../../gradual-types/internal-namespaced.sdf3 line 16">StrategoLang-Module</a>

<span class="keyword">context-free syntax</span>

  <a href="../../gradual-types/internal-namespaced.sdf3#StrategoLang-Module_500_519" id="StrategoLang-Module_272_291" title="Referenced at ../../gradual-types/internal-namespaced.sdf3 line 16">StrategoLang-Module</a>.<span class="cons_Constructor"><span id="Module_292_298" title="Not referenced locally, nor via imports">Module</span></span> = &lt;<span class="cons_String">module</span> &lt;<a href="../identifiers-namespaced.sdf3#StrategoLang-ModName_103_123" id="StrategoLang-ModName_310_330" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a>&gt;

&lt;{<a href="#StrategoLang-AnnoDecl_490_511" id="StrategoLang-AnnoDecl_335_356" title="Defined at line 20, 32">StrategoLang-AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="../../gradual-types/internal-namespaced.sdf3#StrategoLang-Module_500_519" id="StrategoLang-Module_374_393" title="Referenced at ../../gradual-types/internal-namespaced.sdf3 line 16">StrategoLang-Module</a>.<span class="cons_Constructor"><span id="Specification_394_407" title="Not referenced locally, nor via imports">Specification</span></span> = &lt;<span class="cons_String">specification</span>

&lt;{<a href="#StrategoLang-AnnoDecl_490_511" id="StrategoLang-AnnoDecl_428_449" title="Defined at line 20, 32">StrategoLang-AnnoDecl</a> <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }

<span class="keyword">sorts</span> <a href="#StrategoLang-Decl_801_818" id="StrategoLang-Decl_472_489" title="Referenced at line 32">StrategoLang-Decl</a> <a href="#StrategoLang-AnnoDecl_428_449" id="StrategoLang-AnnoDecl_490_511" title="Referenced at line 18">StrategoLang-AnnoDecl</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Decl_801_818" id="StrategoLang-Decl_536_553" title="Referenced at line 32">StrategoLang-Decl</a>.<span class="cons_Constructor"><span id="Imports_554_561" title="Not referenced locally, nor via imports">Imports</span></span> = &lt;<span class="cons_String">imports</span>

&lt;{<a href="#StrategoLang-ImportModName_830_856" id="StrategoLang-ImportModName_576_602" title="Defined at line 34, 38, 42">StrategoLang-ImportModName</a> <span class="cons_Lit">"\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-Decl_801_818" id="StrategoLang-Decl_618_635" title="Referenced at line 32">StrategoLang-Decl</a>.<span class="cons_Constructor"><span id="Strategies_636_646" title="Not referenced locally, nor via imports">Strategies</span></span> = &lt;<span class="cons_String">strategies</span>

&lt;{StrategoLang-Def <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-Decl_801_818" id="StrategoLang-Decl_698_715" title="Referenced at line 32">StrategoLang-Decl</a>.<span class="cons_Constructor"><span id="Signature_716_725" title="Not referenced locally, nor via imports">Signature</span></span> = &lt;<span class="cons_String">signature</span>
&lt;{StrategoLang-Sdecl <span class="cons_Lit">"\n\n"</span>}*&gt;&gt; { }
  <a href="#StrategoLang-AnnoDecl_428_449" id="StrategoLang-AnnoDecl_777_798" title="Referenced at line 18">StrategoLang-AnnoDecl</a> = <a href="#StrategoLang-Decl_472_489" id="StrategoLang-Decl_801_818" title="Defined at line 20, 24, 27, 30">StrategoLang-Decl</a> { }

<span class="keyword">sorts</span> <a href="#StrategoLang-ImportModName_576_602" id="StrategoLang-ImportModName_830_856" title="Referenced at line 26">StrategoLang-ImportModName</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-ImportModName_576_602" id="StrategoLang-ImportModName_881_907" title="Referenced at line 26">StrategoLang-ImportModName</a>.<span class="cons_Constructor"><span id="Import_908_914" title="Not referenced locally, nor via imports">Import</span></span> = <a href="../identifiers-namespaced.sdf3#StrategoLang-ModName_103_123" id="StrategoLang-ModName_917_937" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a> { }

<span class="keyword">syntax</span>

  <a href="#StrategoLang-ImportModName_576_602" id="StrategoLang-ImportModName_953_979" title="Referenced at line 26">StrategoLang-ImportModName</a><span class="keyword">-CF</span>.<span class="cons_Constructor"><span id="ImportWildcard_983_997" title="Not referenced locally, nor via imports">ImportWildcard</span></span> = <a href="../identifiers-namespaced.sdf3#StrategoLang-ModName_103_123" id="StrategoLang-ModName_1000_1020" title="Defined at ../identifiers-namespaced.sdf3 line 8, 17, 18, 19, 20, 21">StrategoLang-ModName</a><span class="keyword">-CF</span> <span class="cons_Lit">"/"</span> <span class="cons_Lit">"-"</span> { }

</code></pre></td></tr></tbody></table></div>