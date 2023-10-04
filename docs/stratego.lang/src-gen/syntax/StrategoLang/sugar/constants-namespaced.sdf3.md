---
title: constants-namespaced.sdf3
hide:
  - toc
---

# `constants-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/constants-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/constants-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../terms-namespaced.sdf3#StrategoLang/sugar/constants-namespaced_136_175" id="StrategoLang/sugar/constants-namespaced_7_46" title="Referenced at ../terms-namespaced.sdf3 line 6">StrategoLang/sugar/constants-namespaced</a>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_58_98" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/constants-namespaced.sdf3#StrategoLang/core/constants-namespaced_7_45" id="StrategoLang/core/constants-namespaced_102_140" title="Defined at ../../core/constants-namespaced.sdf3 line 1">StrategoLang/core/constants-namespaced</a>        
  <a href="../string-quotations-namespaced.sdf3#StrategoLang/sugar/string-quotations-namespaced_7_54" id="StrategoLang/sugar/string-quotations-namespaced_144_191" title="Defined at ../string-quotations-namespaced.sdf3 line 1">StrategoLang/sugar/string-quotations-namespaced</a>

<span class="keyword">sorts</span> <span id="Char_199_203" title="Not referenced locally, nor via imports">Char</span><span class="keyword">-LEX</span> <span id="CharChar_208_216" title="Not referenced locally, nor via imports">CharChar</span><span class="keyword">-LEX</span>

<span class="keyword">lexical syntax</span>

  <a href="#StrategoLang-Char_405_422" id="StrategoLang-Char_240_257" title="Referenced at line 15; ../strategies-namespaced.sdf3 line 58; ../terms-namespaced.sdf3 line 23">StrategoLang-Char</a> = <span class="cons_Lit">"'"</span> <a href="#StrategoLang-CharChar_296_317" id="StrategoLang-CharChar_264_285" title="Defined at line 13, 14">StrategoLang-CharChar</a> <span class="cons_Lit">"'"</span> { }
  <a href="#StrategoLang-CharChar_264_285" id="StrategoLang-CharChar_296_317" title="Referenced at line 12">StrategoLang-CharChar</a> = ~[\'\\\n\r] { }
  <a href="#StrategoLang-CharChar_264_285" id="StrategoLang-CharChar_338_359" title="Referenced at line 12">StrategoLang-CharChar</a> = [\\] [<span class="cons_Regular">t</span><span class="cons_Regular">n</span><span class="cons_Regular">r</span><span class="cons_Regular">b</span><span class="cons_Regular">f</span>\"\'\\] { }
  <span id="StrategoLang-Id_387_402" title="Not referenced locally, nor via imports">StrategoLang-Id</span> = <a href="#StrategoLang-Char_240_257" id="StrategoLang-Char_405_422" title="Defined at line 12">StrategoLang-Char</a> {<span class="keyword">reject</span>}

</code></pre></td></tr></tbody></table></div>