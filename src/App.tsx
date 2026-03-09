import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import BemEstar from './pages/BemEstar';
import Contato from './pages/Contato';
import Galeria from './pages/Galeria';
import Plantas from './pages/Plantas';
import Valores from './pages/Valores';
import Sobre from './pages/Sobre';
import './App.css';

function App() {
  return (
    <Router>
      <Routes>
  <Route path="/" element={<Home />} />
  <Route path="/bem-estar" element={<BemEstar />} />
  <Route path="/contato" element={<Contato />} />
  <Route path="/galeria" element={<Galeria />} />
  <Route path="/plantas" element={<Plantas />} />
  <Route path="/valores" element={<Valores />} />
  <Route path="/sobre" element={<Sobre />} />
      </Routes>
    </Router>
  );
}

export default App;
