import React, { useState } from "react";
import axios from "axios";

function App() {
  const [prices, setPrices] = useState("");
  const [result, setResult] = useState(null);
  const [error, setError] = useState("");

  const analyzeStock = async () => {
    setError("");
    try {
      const response = await axios.post("http://localhost:8080/stocks/analyze", 
        JSON.parse(prices)
      );
      setResult(response.data);
    } catch (err) {
      setError("Invalid input. Please enter a valid array.");
    }
  };

  return (
    <div style={{ textAlign: "center", padding: "20px" }}>
      <h2>Stock Trading Profit Analyzer</h2>
      <p>Enter stock prices as an array (e.g., [7,1,5,3,6,4]):</p>
      <input
        type="text"
        value={prices}
        onChange={(e) => setPrices(e.target.value)}
        placeholder="Enter prices..."
        style={{ width: "300px", padding: "5px" }}
      />
      <br /><br />
      <button onClick={analyzeStock} style={{ padding: "8px 15px", cursor: "pointer" }}>
        Analyze Profit
      </button>

      {error && <p style={{ color: "red" }}>{error}</p>}

      {result && (
        <div style={{ marginTop: "20px", border: "1px solid #ddd", padding: "10px" }}>
          <h3>Analysis Result</h3>
          <p><strong>Max Profit:</strong> {result.maxProfit}</p>
          <p><strong>Buy on Day:</strong> {result.buyDay}</p>
          <p><strong>Sell on Day:</strong> {result.sellDay}</p>
        </div>
      )}
    </div>
  );
}

export default App;
